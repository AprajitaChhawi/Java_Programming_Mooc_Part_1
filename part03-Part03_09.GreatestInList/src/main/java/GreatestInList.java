
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int max_val=-9999999;
        for(Integer i:list){
            max_val=Math.max(max_val, i);
        }
        System.out.println("The greatest number: "+max_val);
    }
}
