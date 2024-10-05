
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        try {
            Scanner sc = new Scanner(Paths.get(fileName));
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            Logger.getLogger("Error: "+e.getMessage());
        }

    }
}
