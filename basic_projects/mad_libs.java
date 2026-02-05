import java.util.Scanner;

public class mad_libs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Adjective1, Adjective2, Adjective3;
        String Noun1;
        String Verb1;

        System.out.print("Enter an adjective (description): ");
        Adjective1 = sc.nextLine();
        System.out.print("Enetr a noun (animal or person): ");
        Noun1 = sc.nextLine();
        System.out.print("Enter a verb end with -ing (action word): ");
        Verb1 = sc.nextLine();
        System.out.print("Enter another adjective (description): ");
        Adjective2 = sc.nextLine();
        System.out.print("Enter one last adjective (description): ");
        Adjective3 = sc.nextLine();

        System.out.println("Here is your story:");
        System.out.println("Today i went to a " + Adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + Noun1 + ".");
        System.out.println(Noun1 + " was " + Adjective2 + " and " + Verb1 + "!");
        System.out.println("I was " + Adjective3 + " to see such a sight!");

        sc.close();
    }
}
