
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String a = scanner.nextLine();
            if(a.length()!=0){
                String [] characters = a.split(" ");
                for (String s : characters){
                    System.out.println(s);
                }
            } else {
                break;
            }
        }
    }
}
