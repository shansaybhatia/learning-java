public class arithmetic {
    public static void main(String[] args) {
        // Arithmetic operators are used to perform basic mathematical operations such
        // as addition, subtraction, multiplication, and division.
        // The basic arithmetic operators in Java are:
        int x = 2;
        int y = 4;
        int z;
        // Addition
        z = x + y;
        System.out.println("Addition: " + z);
        // Subtraction
        z = x - y;
        System.out.println("Subtraction: " + z);
        // Multiplication
        z = x * y;
        System.out.println("Multiplication: " + z);
        // Division
        z = x / y;
        System.out.println("Division: " + z);
        // Modulus
        z = x % y;
        System.out.println("Modulus: " + z);

        // Augmented assignment operators are a shorthand way to perform an operation
        // and assign the result to a variable in one step. The augmented assignment
        // operators in Java include:
        // += (Addition assignment)
        x += y; // equivalent to x = x + y
        System.out.println("Addition assignment: " + x);
        // -= (Subtraction assignment)
        x -= y; // equivalent to x = x - y
        System.out.println("Subtraction assignment: " + x);
        // *= (Multiplication assignment)
        x *= y; // equivalent to x = x * y
        System.out.println("Multiplication assignment: " + x);
        // /= (Division assignment)
        x /= y; // equivalent to x = x / y
        System.out.println("Division assignment: " + x);
        // %= (Modulus assignment)
        x %= y; // equivalent to x = x % y
        System.out.println("Modulus assignment: " + x);

        // Increment and decrement operators are used to increase or decrease the value
        // of a variable by 1. The increment operator is represented by ++, and the
        // decrement operator is represented by --.
        // Increment operator
        x++; // equivalent to x = x + 1
        System.out.println("Increment: " + x);
        // Decrement operator
        x--; // equivalent to x = x - 1
        System.out.println("Decrement: " + x);

        // operators have a specific order of precedence, which determines the order in
        // which they are evaluated in an expression. The order of precedence for
        // arithmetic operators in Java is as follows:
        // Parentheses ( )
        // Exponentiation ( ** )
        // Multiplication ( * ), Division ( / ), Modulus ( % )
        // Addition ( + ), Subtraction ( - )

        double result = 3 + 4 * (7 - 5) / 2.0; // The expression will be evaluated as follows:
        // 1. Parentheses: (7-5) is evaluated first, resulting in 2.
        // 2. Multiplication and Division: 4*2 is evaluated next, resulting in 8. Then,
        // 8/2.0 is evaluated, resulting in 4.0.
        // 3. Addition: Finally, 3+4.0 is evaluated, resulting in 7.0.
        System.out.println("Result: " + result);

    }

}
