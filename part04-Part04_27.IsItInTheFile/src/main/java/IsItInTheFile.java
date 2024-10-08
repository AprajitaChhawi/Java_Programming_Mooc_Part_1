
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(Paths.get(file));
            while(sc.hasNextLine()){
                String name = sc.nextLine();
                list.add(name);
            }
        } catch (Exception ex) {
            System.out.println("Reading the file "+file+" failed.");
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
