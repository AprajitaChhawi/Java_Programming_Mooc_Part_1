
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int a = Integer.valueOf(scanner.nextLine());
        int fac=1;
        for (int i =1; i<=a; i++) {
            fac=fac*i;
        }
        System.out.println("Factorial: "+fac);

    }
}
