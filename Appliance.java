
import java.util.Hashtable;

public class Appliance {
    String name;
    Hashtable<String, Artifact> items;
    public Appliance(String name){
        this.name=name;
        this.items = new Hashtable<String, Artifact>();

    }
    public void put(String item, Artifact artifact){
        this.items.put(item, artifact);
    }
    public void printItem(){
        // for(int i=0;i<this.appliances.size();i++){
        //     System.out.print(this.appliances.get(i).name+", ");
        // }System.out.println("");
        System.out.println(items.keySet());

    }
    // public void examine(){
    //     for(int i=0;i<items.size();i++){
    //         System.out.println(items.get(i));
    //     }
    // }
}
