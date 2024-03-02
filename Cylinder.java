public class Cylinder
{
    private double radius = 7.756;
    private double height = 5.334;
		public Cylinder()
		{
			System.out.println("A no argument constructor");
		}
		public Cylinder(double height)
		{
			this.height = height;
			this.radius = 1;
		}
		public Cylinder(double height, double radius)
		{
			this.height = height;
			this.radius = radius;
		}
		public void setRadius(double radius)
		{
			this.radius = radius;
		}
		public void setHeight(double height)
		{
			this.height = height;
		}
		public double getRadius()
		{
			return radius;
		}

		public double getHeight()
		{
			return height;
		}
		public double computeArea()
		{
			return 2 * Math.PI * radius * (radius + height);
		}
		public double computeVolume()
		{
			return Math.PI * radius * radius * height;
		}
		public void displayInfo()
		{
			System.out.println("Cylinder Height: " + height);
			System.out.println("Cylinder Radius: " + radius);
			System.out.printf("Cylinder Area: %.3f", computeArea());
			System.out.printf("%nCylinder Volume: %.3f", computeVolume());
			System.out.println("\n");
		}
}	