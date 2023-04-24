import java.util.Hashtable;

public class Room {
    Hashtable<String, Appliance> appliances;
    public String name;

    public Room(String name, Hashtable<String, Appliance> appliances){
        this.name=name;
        this.appliances=appliances;

    }

    public void printItem(){
        // for(int i=0;i<this.appliances.size();i++){
        //     System.out.print(this.appliances.get(i).name+", ");
        // }System.out.println("");
        System.out.println(appliances.keySet());

    }
    
}
