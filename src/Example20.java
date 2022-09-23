import java.util.Scanner;
class Example19 {
    public static void main(String[] argv) {
        float year;
        System.out.println("Enter the Year:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        year = inputValue.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}

