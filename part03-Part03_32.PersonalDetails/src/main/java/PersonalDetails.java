
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_len=-999999;
        String name ="";
        int count=0;
        int sum=0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            count=count+1;
            sum=sum+Integer.valueOf(parts[1]);
            if(parts[0].length()>max_len){
                max_len=parts[0].length();
                name=parts[0];
            }
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: "+(float)sum/count);

    }
}
