import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            programs.add(new Book(title,pages,year));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String iden = scanner.nextLine();
        for(Book i:programs){
            if(iden.equals("everything")){
                System.out.println(i);
            } else if(iden.equals("name")){
                System.out.println(i.getTitle());
            }
        }
    }
}
