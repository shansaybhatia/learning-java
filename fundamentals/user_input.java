import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Read user input (use nextLine() to capture full line or next() for single word)

        System.out.print("Enter Your age: ");
        int age = scanner.nextInt(); // Read user input as an integer
        scanner.nextLine();
        // Consume the newline character left by nextInt()

        System.out.print("What is your favourite color?: ");
        String color = scanner.nextLine();

        System.out.print("Whast is your gpa?: ");
        double gpa = scanner.nextDouble(); // Read user input as a double

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // Read user input as a boolean


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite color is " + color + ".");
        System.out.println("Your GPA is " + gpa + ".");
        System.out.println("Student status: " + isStudent);


        // calculate the area of a rectangle

        int length,width,area;
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextInt();
        area = length * width;
        System.out.println("The area of the rectangle is: " + area+ " cm²");    // Numlock+Alt+0178 to make sqaure symbol


        scanner.close();
    }
}
