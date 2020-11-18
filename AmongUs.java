import java.util.Scanner;
import java.awt.*;

public class AmongUs {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        String color = "";
        System.out.println("Colors Available: " + "\n" + "\t Black \n \t Red " +
                        "\n \t Green \n \t Yellow \n \t Blue \n \t Purple \n " +
                        "\t Cyan \n \t White");
            System.out.print("Choose an among us color: ");
            try {
                color = h.nextLine();
                System.out.println(Colors.color(color) + "\n" +
                        "⠀⠀⠀⠀⠀⠀⣠⣴⣶⣿⠿⢿⣶⣶⣦⣄⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⣼⡿⠋⠁⠀⠀⠀⢀⣈⠙⢿⣷⡄⠀⠀\n" +
                        "⠀⠀⠀⠀⢸⣿⠁⠀⢀⣴⣿⠿⠿⠿⠿⠿⢿⣷⣄⠀\n" +
                        "⠀⢀⣀⣠⣾⣿⡇⠀⣾⣿⡄⠀⠀⠀⠀⠀⠀⠀⠹⣧\n" +
                        "⣾⡿⠉⠉⣿⠀⡇⠀⠸⣿⡌⠓⠶⠤⣤⡤⠶⢚⣻⡟\n" +
                        "⣿⣧⠖⠒⣿⡄⡇⠀⠀⠙⢿⣷⣶⣶⣶⣶⣶⢿⣿⠀\n" +
                        "⣿⡇⠀⠀⣿⡇⢰⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣿⠀\n" +
                        "⣿⡇⠀⠀⣿⡇⠈⡄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⠀\n" +
                        "⣿⣷⠀⠀⣿⡇⠀⠘⠦⣄⣀⣀⣀⣀⣀⡤⠊⠀⣿⠀\n" +
                        "⢿⣿⣤⣀⣿⡇⠀⠀⠀⢀⣀⣉⡉⠁⣀⡀⠀⣾⡟⠀\n" +
                        "⠀⠉⠛⠛⣿⡇⠀⠀⠀⠀⣿⡟⣿⡟⠋⠀⢰⣿⠃⠀\n" +
                        "⠀⠀⠀⠀⣿⣧⠀⠀⠀⢀⣿⠃⣿⣇⠀⢀⣸⡯⠀⠀\n" +
                        "⠀⠀⠀⠀⠹⢿⣶⣶⣶⠿⠃⠀⠈⠛⠛⠛⠛⠁⠀⠀\n");
            }
            catch (Exception e){
                System.out.print(e.getMessage());
            }
            String notSus = color + " was not An Imposter";
            String sus = color + " was An Imposter";
            if (color.equalsIgnoreCase("red")) {
                for (int d = 0; d < sus.length(); d++) {
                    System.out.printf("%c", sus.charAt(d));
                    try {
                        Thread.sleep(120);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            else {
                for (int d = 0; d < notSus.length(); d++) {
                    System.out.printf("%c", notSus.charAt(d));
                    try {
                        Thread.sleep(120);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
    }
}
class Colors {
    public  static final String BLACK = "\033[0;30m";   // BLACK
    public  static final String RED = "\033[0;31m";     // RED
    public  static final String GREEN = "\033[0;32m";   // GREEN
    public  static final String YELLOW = "\033[0;33m";  // YELLOW
    public  static final String BLUE = "\033[0;34m";    // BLUE
    public  static final String PURPLE = "\033[0;35m";  // PURPLE
    public  static final String CYAN = "\033[0;36m";    // CYAN
    public  static final String WHITE = "\033[0;37m";   // WHITE

    public static String color(String name){
        if (name.equalsIgnoreCase("black")){
            name = BLACK;
        }
        else if (name.equalsIgnoreCase("red")){
            name = RED;
        }
        else if (name.equalsIgnoreCase("green")){
            name = GREEN;
        }
        else if (name.equalsIgnoreCase("yellow")){
            name = YELLOW;
        }
        else if (name.equalsIgnoreCase("blue")){
            name = BLUE;
        }
        else if (name.equalsIgnoreCase("purple")){
            name = PURPLE;
        }
        else if (name.equalsIgnoreCase("cyan")){
            name = CYAN;
        }
        else if (name.equalsIgnoreCase("white")){
            name = WHITE;
        }
        return name;
    }
}
