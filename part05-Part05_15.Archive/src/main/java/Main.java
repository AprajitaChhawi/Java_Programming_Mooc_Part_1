
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> books = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive book = new Archive(identifier,name);
            System.out.println(books.contains(book));
            if(!(books.contains(book))){
                books.add(book);
            }

        }
        System.out.println("==Items==");
        // NB! Don't alter the line below!
        for(Archive a:books){
            System.out.println(a.getIdentifier()+": "+a.getName());
        }


    }
}
