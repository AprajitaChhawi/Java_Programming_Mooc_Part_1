/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class Archive {
    private String identifier;
    private String name;
    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    public boolean equals(Object compared){
        if(this==compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        Archive b1 = (Archive) compared;
        if(this.identifier.equals(b1.identifier)){
            return true;
        }
        return false;
    }
    
}
