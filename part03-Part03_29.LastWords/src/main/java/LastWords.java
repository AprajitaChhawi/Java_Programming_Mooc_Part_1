
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String a = scanner.nextLine();
            if(a.length()!=0){
                String [] characters = a.split(" ");
                System.out.println(characters[characters.length-1]);
            } else {
                break;
            }
        }


    }
}
