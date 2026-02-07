import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Shopping Cart Problem

        String item;
        int quantity;
        double price, total;
        char currency = '$';

        System.out.print("What item would you like to buy: ");
        item = sc.nextLine();

        System.out.print("What is the price of each: ");
        price = sc.nextDouble();

        System.out.print("How many would you like: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "'s");
        System.out.println("Your total is " + currency + total);

        sc.close();
    }
}
