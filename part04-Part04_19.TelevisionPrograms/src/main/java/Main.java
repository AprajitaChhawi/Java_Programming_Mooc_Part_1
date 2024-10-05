import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Name: ");
            String firstName = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(firstName,duration));
        }
        System.out.println("");
        System.out.print("Identification number: ");
        int iden = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram i:programs){
            if(i.getDuration()<=iden){
                System.out.println(i);
            }
        }

    }
}
