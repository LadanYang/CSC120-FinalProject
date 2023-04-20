import java.util.ArrayList;
import java.util.Hashtable;

public class Room {
    Hashtable <String, ArrayList<Artifact>> items;
    public String name;

    public Room(String name, Hashtable<String, ArrayList<Artifact>>items){
        this.name=name;
        this.items = items;
        

    }
    public void printItem(){
        System.out.println(this.name+" contains: "+this.items.keySet());

    }

}
