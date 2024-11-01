import java.util.Scanner;

public class ConversionProgram {
    public static void main(String[] args) {
        double userInput;
        int menuOption;
        Scanner keyboard = new Scanner(System.in);
        Scanner menuInput = new Scanner(System.in);

        System.out.println("This program converts distance in meters to Kilometers, inches and feet.");
        System.out.println("Enter a distance in meters:");
        userInput = keyboard.nextDouble();
        boolean flag = true;
        while (flag) {
            menu();
            menuOption = menuInput.nextInt();

            if (menuOption < 0 || menuOption == 4) {
                flag = false;
            }
            else {
                switch (menuOption) {
                    case 1 -> showKilometers(userInput);
                    case 2 -> showInches(userInput);
                    case 3 -> showFeet(userInput);
                    default -> System.out.println("Invalid option.");
                };
            }
        }
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

    public static void menu() {
        System.out.println("Enter 4 at any moment to quit the program.");
        System.out.println("Type the number of the option to execute function:");
        System.out.println("1. Convert to kilometers." +
                "\n2. Convert to inches." +
                "\n3. Convert to feet." +
                "\n4. Quit.\n");
    }
}
