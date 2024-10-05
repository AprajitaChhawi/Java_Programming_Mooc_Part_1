
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
    private TodoList todo;
    public UserInterface(TodoList todo,Scanner sc){
        this.todo = todo;
        this.sc = sc;
    }
    public void start(){
        while(true){
            System.out.println("Command: ");
            String cmd = sc.nextLine();
            if(cmd.equals("stop")){
                break;
            } else if(cmd.equals("add")){
                System.out.println("To add: ");
                String add_str = this.sc.nextLine();
                this.todo.add(add_str);
            } else if(cmd.equals("list")){
                this.todo.print();
            } else if(cmd.equals("remove")){
                System.out.println("Which one is removed? ");
                int rm_int = Integer.valueOf(this.sc.nextLine());
                this.todo.remove(rm_int);
            }
        }
    }
    
    
}
