import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] arg) {
        int sysElection = sysElection();
        String userElection = userElection();

        String sysElectionString = switch (sysElection) {
            case 0 -> "PAPER";
            case 1 -> "SCISSORS";
            case 2 -> "ROCK";
            default -> "";
        };
        System.out.println("Your input: " + userElection + "\nSystem election: " + sysElectionString);
        System.out.println("The winner is: " + winner(sysElection, userElection));
    }

    public static int sysElection(){
        return (int)(Math.random() * 3);
    }

    public static String userElection() {
        Scanner keyboard = new Scanner(System.in);
        String input;
        System.out.println("Enter election:");
        input = keyboard.nextLine();

        return input;
    }

    public static String winner(int sysElection, String userElection) {
        String winner;
        winner = switch (sysElection){
            case 0 -> paperBeats(userElection)?
                    "Computer" : userElection.equalsIgnoreCase("PAPER")?
            "Tie" : "User";
            case 1 -> scissorsBeats(userElection)?
                    "Computer ": userElection.equalsIgnoreCase("SCISSORS")?
            "Tie" : "User";
            case 2 -> rockBeats(userElection)?
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

    public static String tie(String sysElection, String userElection) {
        return "Tie";
    }
}
