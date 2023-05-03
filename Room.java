/**
 * The Room class has 3 attributes and 2 methods
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/
import java.util.Hashtable;
import java.util.Set;

public class Room {
    Hashtable<String, Appliance> appliances;
    public String name;
    String profile;

    public Room(String name, Hashtable<String, Appliance> appliances, String profile){
        /** Name of the room*/
        this.name=name;
        /** The hashtable of appliances within the room*/
        this.appliances=appliances;
        /** The associated investigative profile of person associated with that room */
        this.profile= profile;
    }

    // public Room(String name){
    //     this.name=name;
    // }

    /** Prints out the associated investigative profile */
    public String printProfile(){
        //System.out.println(this.profile);
        return this.profile;
    }

    
    /** Prints out the appliances within that room */
    public Set<String> printAppliance(){
        //System.out.println(appliances.keySet());
        return appliances.keySet();

    }
    
}
