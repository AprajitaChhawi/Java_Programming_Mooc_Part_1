
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give numbers:");
        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }else if (input%2== 0) {
                sum +=input;
                invalidNumbers++;
            } else {
                sum += input;
                validNumbers++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + (validNumbers+invalidNumbers));
        System.out.println("Average: " + (float)sum/(validNumbers+invalidNumbers));
        System.out.println("Even: " +invalidNumbers);
        System.out.println("Odd: " +validNumbers);
        //System.out.println("Invalid numbers: " + invalidNumbers);

    }
}
