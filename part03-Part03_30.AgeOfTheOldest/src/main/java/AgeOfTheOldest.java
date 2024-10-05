
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_val=-999999;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            max_val=Math.max(max_val,Integer.valueOf(parts[1]));
        }

        if (max_val > -999999) {
            System.out.println("Age of the oldest:  " + max_val);
        }

    }
}
