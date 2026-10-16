package fundamentals;

import java.util.Scanner;

public class TenaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        String EvenOdd = (num % 2 == 0) ? "Given number is Even" : "Given number is Odd";
        System.out.println(EvenOdd);

        sc.close();
    }
}
