import java.util.Scanner;

public class taskOne
{	
	public static void main(String[] args)
	{
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(10);
        Cylinder cylinder3 = new Cylinder(6, 4);

        cylinder1.displayInfo();
        cylinder2.displayInfo();
        cylinder3.displayInfo();
    }
}