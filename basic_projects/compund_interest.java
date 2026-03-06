import java.util.Scanner;

public class compund_interest {
    public static void main(String[] args) {
        // Compound Interest Calculation
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (annualRate / 100) / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d years is: $%.2f\n", years, amount);

        scanner.close();

    }
}
