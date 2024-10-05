
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String a = scanner.nextLine();
            if(a.length()!=0){
                String [] characters = a.split(" ");
                System.out.println(characters[0]);
            } else {
                break;
            }
        }


    }
}
