/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class Product {
    private String name;
    private String location;
    private int weight;
    public Product(String name){
        this(name,"shelf",1);
    }
    public Product(String name, String location){
        this(name,location,1);
    }
    public Product(String name, int weight){
        this(name,"shelf",weight);
    }
    public Product(String name , String location , int weight){
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    public String toString(){
        return this.name+" ("+this.weight+" kg) can be found from the "+this.location;
    }
    
}
