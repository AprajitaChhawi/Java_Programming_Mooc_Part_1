
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade gc= new Grade();
        UserInterface ui = new UserInterface(scanner,gc);
        ui.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
