
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String print ="";
        if(this.elements.size()==0){
            return "The collection "+this.name+" is empty.";
        }
        String s ="";
        if(this.elements.size()==1){
            print = print + "The collection "+this.name+" has "+this.elements.size()+" element:";
            String element1 = this.elements.get(0);
            return print +"\n"+element1;
        }
        print = print + "The collection "+this.name+" has "+this.elements.size()+" elements:";
        String element = "";
        for(String name: elements){
            element = element + name.trim() + "\n";
        }
        return print +"\n"+element;
    }
    
}
