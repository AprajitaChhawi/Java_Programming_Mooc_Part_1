
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class Stack {
    ArrayList<String> stack = new ArrayList<>();
    
    public boolean isEmpty(){
        return this.stack.size()==0;
    }
    public void add(String value){
        this.stack.add(value);
    }
    public ArrayList<String> values(){
        ArrayList<String> stack1 = new ArrayList<>();
        for(String value: this.stack){
            stack1.add(value);
        }
        return stack1;
    }
    public String take(){
        int last = this.stack.size()-1;
        String value = this.stack.get(last);
        this.stack.remove(last);
        return value;
    }
}
