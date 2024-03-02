public class Date
{
    private int day;
    private int month;
    private int year;

		public Date() {
			this.day = 7;
			this.month = 10;
			this.year = 2020;
		}
		public Date(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public void printDate() {
			System.out.println(day + " / " + month + " / " + year);
		}
		public void setDay(int day) {
			if (day > 30) {
				day = 1;
			}
			this.day = day;
		}
		public void setMonth(int month) {
			if (month > 12) {
				month = 1;
			}
			this.month = month;
		}
		public int getDay() {
			return day;
		}
		public int getMonth() {
			return month;
		}
}