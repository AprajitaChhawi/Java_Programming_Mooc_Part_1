/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class Container {
    private int capacity;
    public Container(){
        this.capacity = 0;
    }
    public int contains(){
        return this.capacity;
    }
    public void add(int amount) {
        if(amount>0){
            this.capacity = this.capacity +amount;
            if(this.capacity>100){
                this.capacity =100;
            }
        }
    }
    public void remove(int amount){
        if(amount>0){
            this.capacity = this.capacity -amount;
            if(this.capacity<0){
                this.capacity =0;
            }
        } 
    }
    public String toString(){
        return this.capacity+"/100";
    }
}
