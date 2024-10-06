
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class UserInterface {
    private Scanner sc;
    private Grade gc;
    public UserInterface(Scanner sc , Grade gc){
        this.sc = sc;
        this.gc = gc;
    }
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int number = Integer.valueOf(sc.nextLine());
            if(number==-1){
                break;
            } else if(number<0 || number>100){
                continue;
            } else{
                this.gc.add(number);
            }
        }
        System.out.println("Point average (all): "+this.gc.averagePoints());
        System.out.println("Point average (passing): "+this.gc.averagePointsPassing());
        System.out.println("Pass percentage: "+this.gc.passingPercentage());
        this.gc.printGradeDistribution();
    }
    
}
