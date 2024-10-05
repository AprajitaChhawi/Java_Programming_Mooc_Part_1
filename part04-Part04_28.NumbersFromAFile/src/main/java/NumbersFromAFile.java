
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(Paths.get(file));
            while(sc.hasNextLine()){
                int number = Integer.valueOf(sc.nextLine());
                list.add(number);
            }
        } catch (Exception ex) {
            System.out.println("Reading the file "+file+" failed.");
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count=0;
        for(Integer i:list){
            if(i>=lowerBound && i<=upperBound){
                count=count+1;
            }
        }
        System.out.println("Numbers: "+count);

    }

}
