public class forloops {
    public static void main(String[] args) {
        // for loop example
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        // nested for loop example
        for (int j = 1; j <= 3; j++) {
            for (int k = 1; k <= 2; k++) {
                System.out.println("j: " + j + ", k: " + k);
            }
        }

        // printing even numbers from 1 to 10 using for loop
        System.out.println("Even numbers from 1 to 10:");
        for (int m = 1; m <= 10; m++) {
            if (m % 2 == 0) {
                System.out.print(m + " ");
            }
        }

        // print square pattern using for loop
        System.out.println("\nSquare pattern:");
        int size = 4;
        for (int n = 1; n <= size; n++) {
           System.out.println("****");
        }

        // reverse of a number using for loop
        int n = 10899;
        int reverse = 0;
        for(int a = n; a > 0; a /= 10) {
            int lastDigit = a % 10;
            reverse = reverse * 10 + lastDigit;
        }
        System.out.println("Reverse of " + n + " is: " + reverse);

    }
}
