
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5,4};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+", ");
        }
        System.out.print(array[array.length-1]);
        // Write some code in here
    }
}
