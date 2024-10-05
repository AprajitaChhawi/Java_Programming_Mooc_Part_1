
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a==-1){
                break;
            }
            list.add(a);
        }
        int sum=0;
        for(Integer i:list){
            sum=sum+i;
        }

        System.out.println("Average: "+(float)sum/list.size());

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
