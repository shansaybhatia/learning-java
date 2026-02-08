import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number;
        boolean isHeads;
        double num;

        number = random.nextInt(); // gives random integer between -2,147,483,648 and 2,147,483,647
        System.out.println("Random integer: " + number);
        number = random.nextInt(100); // gives random integer between 0 and 99
        System.out.println("Random integer between 0 and 99 : " + number);

        isHeads = random.nextBoolean(); // gives random boolean value (true or false)
        System.out.println(isHeads);

        num = random.nextDouble(); // gives random double value between 0.0 and 1.0
        System.out.println("Random double between 0.0 and 1.0: " + num);

        if (isHeads) {
            System.out.println("It's heads!");

        } else {
            System.out.println("It's tails!");
        }
    }
}
