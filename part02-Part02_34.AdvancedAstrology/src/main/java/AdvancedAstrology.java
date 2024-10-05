
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i=0;i<number;i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i=0;i<number;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i=1;i<=size;i++){
            printSpaces(size-i);
            printStars(i);
        }
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        for(int i=1;i<=height;i++){
            printSpaces(height-i);
            printStars(2*i-1);
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<height-2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<3;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        christmasTree(4);
    }
}
