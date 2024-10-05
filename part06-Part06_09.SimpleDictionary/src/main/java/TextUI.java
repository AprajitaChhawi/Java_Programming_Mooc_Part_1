
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    public TextUI(Scanner scanner , SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;   
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String s = this.scanner.nextLine();
            if(s.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            else if(s.equals("add")){
                System.out.println("Word: ");
                String key = this.scanner.nextLine();
                System.out.println("Translation: ");
                String value = this.scanner.nextLine();
                this.dict.add(key, value);
            }
            else if(s.equals("search")){
                System.out.println("To be translated: ");
                String key2 = this.scanner.nextLine();
                if(this.dict.contains(key2)){
                    System.out.println("Translation: "+this.dict.translate(key2));
                } else {
                    System.out.println("Word "+key2+" was not found");
                }
            }
            System.out.println("Unknown command");
        }
    }
    
    
}
