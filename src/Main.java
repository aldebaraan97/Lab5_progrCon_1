public class Main {
    public static void main(String[] args) {
        System.out.println(color());
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

    public static boolean compareColors(String color) {

    }


}