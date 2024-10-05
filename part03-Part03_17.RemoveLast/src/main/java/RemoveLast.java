
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    public static void removeLast(ArrayList<String> numbers){
        if(numbers.size()!=0){
            numbers.remove(numbers.size()-1);
        }
    }

}
