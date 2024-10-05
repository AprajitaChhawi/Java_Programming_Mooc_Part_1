
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int holdCapacity;
    
    public Hold(int holdCapacity){
        this.suitcases = new ArrayList<>();
        this.holdCapacity = holdCapacity;
    }
    public int getHoldWeight(){
        int hold_weight = 0;
        for(Suitcase i:suitcases){
            hold_weight = hold_weight +i.totalWeight();
        }
        return hold_weight;
    }
    public void addSuitcase(Suitcase suitcase){
        if(this.getHoldWeight()+suitcase.totalWeight()<=this.holdCapacity){
            this.suitcases.add(suitcase);
        }
    }
    public String toString(){
        if(this.suitcases.size()==0){
            return "no suitcase (0 kg)";
        }
        String s ="";
        if(this.suitcases.size()>1){
            s= "s";
        }
        return this.suitcases.size()+" suitcase"+s+" ("+this.getHoldWeight()+" kg)";
    }
    public void printItems(){
        for(Suitcase i:suitcases){
            i.printItems();
        }
    }
    
}
