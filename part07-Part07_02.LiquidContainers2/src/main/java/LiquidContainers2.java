
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();
        while (true) {
            System.out.println("First: "+ c1);
            System.out.println("Second: "+ c2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if(command.equals("add")&&amount>0){
                    c1.add(amount);
                } else if(command.equals("move")&&amount>0){
                    int amount2 = c1.contains();
                    c1.remove(amount);
                    c2.add(Math.min(amount, amount2));
                } else if(command.equals("remove")&&amount>0){
                    c2.remove(amount);
                }
            }
            //System.out.println("First: "+container1+"/100");
        }
    }

}
