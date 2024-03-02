import java.util.Scanner;

public class taskThree
{
    public static void main(String args[])
	{
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.03);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("After setting interest rate to 3%:");
        System.out.printf("Saver 1 balance: $ %.2f", saver1.getSavingsBalance());
        System.out.printf("\nSaver 2 balance: $ %.2f", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\n\nAfter setting interest rate to 4%:");
        System.out.printf("Saver 1 balance: $ %.2f", saver1.getSavingsBalance());
        System.out.printf("\nSaver 2 balance: $ %.2f", saver2.getSavingsBalance());
    }
}