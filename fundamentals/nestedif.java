public class nestedif {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 100.0;
        if (isStudent) {
            if (isSenior) {
                System.out.println("You are a senior student. You get a 20% discount.");
                price *= 0.8; // Apply 20% discount
                System.out.println("The discounted price is: $" + price);
            } else {
                System.out.println("You are a student. You get a 10% discount.");
                price *= 0.9; // Apply 10% discount
                System.out.println("The discounted price is: $" + price);
            }
        } else {
            if (isSenior) {
                System.out.println("You are a senior. You get a 15% discount.");
                price *= 0.85; // Apply 15% discount
                System.out.println("The discounted price is: $" + price);
            } else {
                System.out.println("You are not eligible for a discount.");
                System.out.println("The price is: $" + price);
            }
        }
    }
}
