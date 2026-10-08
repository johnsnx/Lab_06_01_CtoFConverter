import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declarations
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        System.out.println("Enter in a temperature in Celsius: ");

        if (in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input! Please enter a number.");
            System.exit(0);
        }

        fahrenheit = celsius * (9.0/5.0) + 32;

        System.out.println("Your temperature in Fahrenheit is: " + fahrenheit + " degrees.");
    }
}