
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a==9999){
                break;
            }
            list.add(a);
        }
        int min_val = 10000;
        int index = -1;
        for(int i=0;i<list.size();i++){
            if(min_val>list.get(i)){
                min_val=list.get(i);
                index=i;
            }
        }
        System.out.println("Smallest number: "+min_val);
        System.out.println("Found at index: "+index);

        
    }
}
