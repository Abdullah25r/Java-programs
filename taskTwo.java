import java.util.Scanner;

public class taskTwo
{
    public static void main(String args[])
	{
        Date d1 = new Date();
        Date d2 = new Date(22, 9, 2023);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        Date d3 = d2;
        Date d4 = d3;

        d3.setMonth(11);

        d1.printDate();
        d2.printDate();
        d3.printDate();
        d4.printDate();
    }
}