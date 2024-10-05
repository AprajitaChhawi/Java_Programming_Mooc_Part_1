
import java.util.Arrays;


public class MainProgram {

    public static int smallest(int[] array){
        if(array.length==0){
            return -1;
        }
        int smallest = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        if(array.length==0){
            return -1;
        }
        int smallest = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<array[smallest]){
                smallest = i;
            }
        }
        return smallest;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallest_index = startIndex;
        for(int i = startIndex;i<table.length;i++){
            if(table[i]<smallest){
                smallest = table[i];
                smallest_index =i;
            }
        }
        return smallest_index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array [index2];
        array[index2] = temp;
    }
    public static void sort(int[] array) {
        System.out.print("Before sort:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            swap(array,i , indexOfSmallestFrom(array, i));
            System.out.println("After first sort " + Arrays.toString(array));
        }

    }
    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {11, 6, 9, 8, 12};
        MainProgram.sort(numbers);
        for(Integer i:numbers){
            System.out.println(i);
        }
    }

}
