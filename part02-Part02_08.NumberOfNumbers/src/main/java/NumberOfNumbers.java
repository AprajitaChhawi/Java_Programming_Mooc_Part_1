
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number: ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                num = num + 1;
            }
        }
        System.out.println("Number of numbers: " + num);

    }
}
