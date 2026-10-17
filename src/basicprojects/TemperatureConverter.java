package basicprojects;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the Temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        // for degree symbol = NUMLOCK + ALT + 0176
        System.out.printf("%.2f°%s \n", newTemp, unit);

        sc.close();
    }
}
