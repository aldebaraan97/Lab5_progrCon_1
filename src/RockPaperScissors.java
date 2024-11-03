import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] arg) {
        System.out.println("""
                Program to play ROCK, PAPER, SCISSORS game against the computer.
                Enter only 'ROCK', 'PAPER' or 'SCISSORS' (case insensitive).
                Any other input will assign the user a random choice.""");
        String userElection = userElection();
        String sysElection = randomElection();
        System.out.println("Your input: " + userElection + "\nSystem election: " + sysElection);
        System.out.println("The winner is: " + winner(sysElection, userElection));
    }

    public static String randomElection(){
        String sysElection;
        sysElection = switch ((int) (Math.random() * 3)) {
            case 0 -> "PAPER";
            case 1 -> "SCISSORS";
            case 2 -> "ROCK";
            default -> "";
        };
        return sysElection;
    }

    public static String userElection() {
        Scanner keyboard = new Scanner(System.in);
        String input;
        String userElection;
        System.out.println("Enter election:");

        input = keyboard.nextLine();
        userElection = switch (input.toUpperCase()) {
            case "PAPER" -> "PAPER";
            case "ROCK" -> "ROCK";
            case "SCISSORS" -> "SCISSORS";
            default -> randomElection();
        };
        return userElection;
    }

    public static String winner(String sysElection, String userElection) {
        String winner;
        winner = switch (sysElection){
            case "PAPER" -> paperBeats(userElection)?
                    "Computer" : userElection.equalsIgnoreCase("PAPER")?
            "Tie" : "User";
            case "SCISSORS" -> scissorsBeats(userElection)?
                    "Computer ": userElection.equalsIgnoreCase("SCISSORS")?
            "Tie" : "User";
            case "ROCK" -> rockBeats(userElection)?
                    "Computer" : userElection.equalsIgnoreCase("ROCK")?
            "Tie" : "User";
            default -> "Tie";
        };
        return winner;
    }

    public static boolean paperBeats(String RPS) {
        return RPS.equalsIgnoreCase( "ROCK");
    }

    public static boolean scissorsBeats(String RPS) {
        return RPS.equalsIgnoreCase( "PAPER");
    }

    public static boolean rockBeats(String RPS) {
        return RPS.equalsIgnoreCase("SCISSORS");
    }
}