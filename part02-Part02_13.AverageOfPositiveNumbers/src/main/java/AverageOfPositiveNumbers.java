
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num=0;
        while (true) {
            System.out.println("Give a number: ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if(number>0) {
                sum = number + sum;
                num=num+1;
            }
        }
        if(num==0){
            System.out.println("Cannot calculate the average");
        }
        System.out.println((float)sum/num);

    }
}
