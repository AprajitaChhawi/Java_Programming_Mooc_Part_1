
import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDataList = new BirdDatabase();
        UserInterface  userInterface = new UserInterface(scanner, birdDataList);
        userInterface.start();
    }
}
