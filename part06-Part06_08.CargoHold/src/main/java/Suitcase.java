
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
public class Suitcase {
    private ArrayList<Item> items;
    private int capacity;
    
    public Suitcase(int weight){
        this.capacity = weight;
        items = new ArrayList<>();
    }
    public int totalWeight(){
        int weight =0;
        for(Item i:items){
            weight = weight +i.getWeight();
        }
        return weight;
    }
    
    public void addItem(Item item){
        if(this.totalWeight()+item.getWeight()<=this.capacity){
            this.items.add(item);
        }
    }
    public String toString(){
        if(this.items.size()==0){
            return "no items (0 kg)";
        }
        String s ="";
        if(this.items.size()>1){
            s= "s";
        }
        return this.items.size()+" item"+s+" ("+this.totalWeight()+" kg)";
    }
    public void printItems(){
        for(Item i:items){
            System.out.println(i.toString());
        }
    }
    public Item heaviestItem(){
        if(this.items.size()==0){
            return null;
        }
        Item heavy = this.items.get(0);
        for(Item i:items){
            if(i.getWeight()>heavy.getWeight()){
                heavy = i;
            }
        }
        return heavy;
    }
}
