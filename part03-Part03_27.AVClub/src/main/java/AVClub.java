
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String a = scanner.nextLine();
            if(a.length()!=0){
                String [] characters = a.split(" ");
                for (String s : characters){
                    if(s.contains("av")){
                        System.out.println(s);
                    }
                }
            } else {
                break;
            }
        }


    }
}
