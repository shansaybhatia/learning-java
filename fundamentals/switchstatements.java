public class switchstatements {
    public static void main(String[] args) {
        int dayOfWeek = 3; // 1 for Monday, 2 for Tuesday, ..., 7 for Sunday

        switch (dayOfWeek) {
            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is Wednesday.");
                break;
            case 4:
                System.out.println("Today is Thursday.");
                break;
            case 5:
                System.out.println("Today is Friday.");
                break;
            case 6:
                System.out.println("Today is Saturday.");
                break;
            case 7:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }

        // leap year example

        int year = 2024;

        switch (year % 4) {
            case 0:
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                } else {
                    System.out.println(year + " is a leap year.");
                }
                break;
            default:
                System.out.println(year + " is not a leap year.");
        }
    }
}

/*
 * implicit type conversion or widening conversion happens when you assign a
 * smaller data type to a larger data type. For example, assigning an int to a
 * double is allowed because a double can hold all the values of an int without
 * losing information. This is done automatically by Java.
 */
/*
 * explicit type conversion or narrowing conversion happens when you assign a
 * larger data type to a smaller data type. For example, assigning a double to
 * an int is not allowed without explicit casting because it can lead to loss of
 * information. You need to explicitly cast the double to an int, which tells
 * Java that you are aware of the potential loss of information and still want
 * to proceed with the conversion.
 */