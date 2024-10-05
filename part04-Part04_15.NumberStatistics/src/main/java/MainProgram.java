
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            } else if(input%2==0){
                statistics.addNumber(input);
                statistics1.addNumber(input);
            } else{
                statistics2.addNumber(input);
                statistics1.addNumber(input);
            }
        }
        System.out.println("Sum: "+statistics1.sum());
        System.out.println("Sum of even numbers: " + statistics.sum());
        System.out.println("Sum of odd numbers: " + statistics2.sum());
    }
}
