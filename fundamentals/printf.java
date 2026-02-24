public class printf {
    public static void main(String[] args) {
        String name = "Nauva";
        int age = 30;
        double height = 1.75;
        char grade = 'A';
        boolean isStudent = true;

        // Using printf to format output
        System.out.printf("Name: %s\n", name); // %s for string
        System.out.printf("Age: %d\n", age); // %d for integer
        System.out.printf("Height: %.1f meters\n", height); // %.1f for floating-point with 1 decimal place
        System.out.printf("Grade: %c\n", grade); // %c for character
        System.out.printf("Is Student: %b\n", isStudent); // %b for

        // Combining multiple variables in one printf statement
        System.out.printf("%s is %d years old and %.1f meters tall.\n", name, age, height);

        // + flag to include a plus sign for positive numbers
        System.out.printf("Age with sign: %+d\n", age); // +30
        System.out.printf("Height with sign: %+1.1f meters\n", height);

        // , flag to include a comma as a thousands separator
        int largeNumber = 1000000;  
        System.out.printf("Large number with comma: %,d\n", largeNumber); // 1,000,000

        // ( flag to enclose negative numbers in parentheses
        int negativeNumber = -500;
        System.out.printf("Negative number with parentheses: (%d)\n", negativeNumber); // (500)
        // space flag to include a space before positive numbers
        System.out.printf("Age with space: % d\n", age); //  30

        // width specifier to specify a minimum width for the output
        System.out.printf("Name with width: %10s\n", name); // right-aligned within 10 characters
        System.out.printf("Name with left alignment: %-10s\n", name); // left   
        // 0 flag to pad numbers with leading zeros
        System.out.printf("Age with leading zeros: %05d\n", age); // 00030

    }
}
