
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        while (true) {
            System.out.println("First: "+ container1 + "/100");
            System.out.println("Second: "+ container2 + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if(command.equals("add")&&amount>0){
                    container1 = container1+amount;
                    if(container1>100){
                        container1 = 100;
                    }
                } else if(command.equals("move")&&amount>0){
                    container2 = container2+Math.min(container1, amount);
                    container1 = container1-amount;
                    if(container2>100){
                        container2 = 100;
                    }
                    if(container1<0){
                        container1 = 0;
                    }
                } else if(command.equals("remove")&&amount>0){
                    container2 = container2-amount;
                    if(container2<0){
                        container2 = 0;
                    }
                }
            }
            //System.out.println("First: "+container1+"/100");
        }
    }
}
