import java.util.Scanner;

public class ConversionProgram {
    public static void main(String[] args) {
        double userInput;
        // TODO: Welcome text
        System.out.println("This program converts distance in meters to Kilometers, inches and feet.");

        // TODO: Prompt user for input
        System.out.println("Enter a distance in meters:");
        userInput = userInput();

        // TODO: Display menu
        menu();
        userInput = userInput();

        switch (userInput) {
            case 1 -> showKilometers(userInput);
            case 2 -> showInches(userInput);
            case 3 -> showFeet(userInput);
            case 4 -> quit(userInput);
            default -> System.out.println("Invalid option.");
        };

    }

    public static double userInput() {
        Scanner input = new Scanner(System.in);
        double distance;
        distance = input.nextDouble();
        return distance;
    }

    public static void showKilometers(double meters) {
        System.out.println(meters * 0.001);
    }

    public static void showInches(double meters) {
        System.out.println(meters * 39.37);
    }

    public static void showFeet(double meters) {
        System.out.println(meters * 3.281);
    }

    // TODO: menu()
    public static void menu() {
        System.out.println("Type the number of the option to execute function:");
        System.out.println("1. Convert to kilometers." +
                "\n2. Convert to inches." +
                "\n3. Convert to feet." +
                "\n4. Quit.");
    }

    // TODO: quit(int quit)
}
