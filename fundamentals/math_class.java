import java.util.Scanner;

public class math_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = 4.0;
        double num2 = 2.0;

        System.out.println(Math.PI); // gives the value of pi
        System.out.println(Math.E); // gives the value of e (exponential constant)

        // Absolute value
        System.out.println("Absolute value of num1: " + Math.abs(num1));
        // absolute value is the non-negative value of a number without regard to its
        // sign

        // Power
        System.out.println("num1 raised to the power of num2: " + Math.pow(num1, num2));

        // Square root
        System.out.println("Square root of num1: " + Math.sqrt(num1));

        // Maximum and minimum
        System.out.println("Maximum of num1 and num2: " + Math.max(num1, num2));
        System.out.println("Minimum of num1 and num2: " + Math.min(num1, num2));

        // Rounding
        System.out.println("Rounded value of num1: " + Math.round(num1));
        // Rounds to the nearest whole number gives long value
        System.out.println("Ceiling value of num1: " + Math.ceil(num1));
        // Rounds up to the nearest whole number gives double value
        System.out.println("Floor value of num1: " + Math.floor(num1));
        // Rounds down to the nearest whole number gives double value

        // Trigonometric functions
        System.out.println("Sine of num1: " + Math.sin(num1));
        System.out.println("Cosine of num1: " + Math.cos(num1));
        System.out.println("Tangent of num1: " + Math.tan(num1));

        // Example: Calculate the hypotenuse of a right triangle given its height and
        // base
        double height, base, hypotenuse;
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();
        hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
        System.out.println("The hypotenuse of the triangle is: " + hypotenuse + " cm²");

        //Numlock+Alt+0179 to make cube symbol

        sc.close();
    }
}
