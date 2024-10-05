
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int c = Integer.valueOf(scanner.nextLine());
        for (int i = c; i <=a; i++) {
            System.out.println(i);
        }
        // Write your program here
    }
}
