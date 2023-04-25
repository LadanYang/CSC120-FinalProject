import java.util.Hashtable;

public class Room {
    Hashtable<String, Appliance> appliances;
    public String name;
    String profile;

    public Room(String name, Hashtable<String, Appliance> appliances, String profile){
        this.name=name;
        this.appliances=appliances;
        this.profile= profile;
    }

    public Room(String name){
        this.name=name;
    }
    public void printProfile(){
        System.out.println(this.profile);
    }
    public void printItem(){
        // for(int i=0;i<this.appliances.size();i++){
        //     System.out.print(this.appliances.get(i).name+", ");
        // }System.out.println("");
        System.out.println(appliances.keySet());

    }
    
}
