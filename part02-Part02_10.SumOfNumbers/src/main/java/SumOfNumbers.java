
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                sum = number + sum;
            }
        }
        System.out.println("Sum of the numbers: " + sum);

    }
}
