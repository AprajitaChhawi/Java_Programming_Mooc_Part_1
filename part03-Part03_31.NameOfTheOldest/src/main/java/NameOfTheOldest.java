
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_val=-999999;
        String name ="";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if(Integer.valueOf(parts[1])>max_val){
                max_val=Integer.valueOf(parts[1]);
                name=parts[0];
            }
        }

        if (name!=null) {
            System.out.println("Name of the oldest: " + name);
        } 


    }
}
