import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int guess = 0;
        int correctGuess = 0;
        String sysColor;
        String userColor;
        System.out.println("This program tests your Extrasensory Perception (ESP).");
        System.out.println("Enter 10 colors and let's see how many you guess right ;)");
        while (guess <= 10){
            sysColor = color();
            userColor = userColor();

            if (isEqual(userColor, sysColor)) {
                correctGuess++;
            }
            guess++;
        }

        System.out.println(correctGuess);
    }

    public static int colorRandomizer() {
        return (int)(Math.random() * 4);
    }

    public static String color(){
        String COLOR;
        COLOR = switch (colorRandomizer()) {
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