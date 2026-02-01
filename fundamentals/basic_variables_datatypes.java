public class basic_variables_datatypes {

    public static void main(String[] zargs) {
        // This is a Comment
        /*
         * This is a
         * multi line Comment
         */
        System.out.println("Hello World");
        System.out.println("This is my First code in Learning Java");
        System.out.println("This is my Second code in Learning Java");

        /*
         * variable = a reusable container for a value
         * a variable behaves as if it was the value it contains
         * Two Types:
         * 1. Primitive: Simple value stored directly in memory (stack)
         * 2. Reference: memory address (stack) that points to the (heap)
         * 
         * Primitive vs Reference
         * int arrays
         * char strings (sometimes primitive)
         * double object
         * float
         * boolean
         * 
         * 2 steps to create a variable : Declaration & assignment
         */

        int age = 18;
        int year = 2026;
        System.out.println("My Current age is " + age);
        System.out.println("My Current year is " + year);

        double cgpa = 7.5;
        System.out.println("My CGPA for 1st year is " + cgpa);

        char Clang = 'A';
        System.out.println("My grade in Programming in C language is " + Clang);

        boolean isStudent = true; // camelCase naming is used i.e. first alphabet is small and then can be Big
        System.out.println("Am i a student: " + isStudent);

        String name = "Shansay Bhatia";
        System.out.println("My name is " + name);

        String color = "Black";
        String car = "BMW";
        System.out.println("My choice is " + color + " " + car);

    }
}
