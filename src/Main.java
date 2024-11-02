import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guess = 0;
        int correctGuess = 0;
        String sysColor;
        String userColor;

        System.out.println("This program tests your Extrasensory Perception (ESP).");
        System.out.println("Color options: RED, GREEN, ORANGE, YELLOW.");
        System.out.println("Enter 10 colors and let's see how many colors you guess right ;)");

        while (guess <= 9){
            sysColor = sysColor();
            userColor = userColor();

            if (!isEqual(userColor, sysColor)) {
                System.out.println("Incorrect. The random color is " + sysColor);
            }
            else{
                correctGuess++;
                System.out.println("Your intuition was correct! The random color is " + sysColor +
                        "\nYou have guessed " + correctGuess + " colors correctly");
            }
            guess++;
        }
    }

    public static String sysColor(){
        String COLOR;
        COLOR = switch ((int)(Math.random() * 4)) {
            case 0 -> "RED";
            case 1 -> "GREEN";
            case 2 -> "ORANGE";
            case 3 -> "YELLOW";
            default -> "";
        };
        return COLOR;
    }

    public static String userColor() {
        Scanner keyboard = new Scanner(System.in);
        String userInput;

        System.out.println("Enter a color: ");
        userInput = keyboard.nextLine();
        return userInput;
    }

    public static boolean isEqual(String userColor, String sysColor) {
        return userColor.compareToIgnoreCase(sysColor) == 0;
    }
}