
import java.util.Hashtable;
import java.util.Set;
/**
 * The Appliance class has 2 attributes and 2 methods
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/


public class Appliance {
    String name;
    Hashtable<String, Artifact> items;
    public Appliance(String name){
     
    /** Name of this object*/
        this.name=name;

    /** The associated artifacts it holds*/
        this.items = new Hashtable<String, Artifact>();

    }

    /** Setter for putting artifacts within given appliance
     * @param item
     * @param artifact
    */
    public void put(String item, Artifact artifact){
        this.items.put(item, artifact);
    }

    /** Getter for printing the items  */
    public Set<String> printItem(){
        //System.out.println(items.keySet());
        return items.keySet();
    }
}
