import java.util.Scanner;

public class while_dowhile_loop {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // infinite loop example
        /*
         * while (true) {
         * System.out.println("This is an infinite loop.");
         * }
         */

        // do-while loop example
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 5);

        Scanner sc = new Scanner(System.in);
        // printing numbers from 1 to n using while loop
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        // sum of first n natural numbers using while loop
        System.out.print("\nEnter a number: ");
        int m = sc.nextInt();
        int sum = 0;
        int j = 1;
        while (j <= m) {
            sum += j;
            j++;
        }
        System.out.println("The sum of first " + m + " natural numbers is: " + sum);

        //reversing a number using while loop
        int a = 10899;
        while(a>0){
            int lastDigit = a % 10;
            System.out.print(lastDigit);
            a /= 10;
        }

        sc.close();

    }
}
