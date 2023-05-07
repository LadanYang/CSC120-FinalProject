/**
 * The Room class has 3 attributes and 2 methods
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/
import java.util.Hashtable;
import java.util.Set;

/**
 * Class room
 */
public class Room {
    Hashtable<String, Appliance> appliances;
    public String name;
    String profile;

    /**
     * Room class constructor
     * @param String name of the room
     * @param hashtable of appliance name and appliance
     * @param String the profile of the room's owner
     */
    public Room(String name, Hashtable<String, Appliance> appliances, String profile){
        /** Name of the room*/
        this.name=name;
        /** The hashtable of appliances within the room*/
        this.appliances=appliances;
        /** The associated investigative profile of person associated with that room */
        this.profile= profile;
    }


    /**
     * Accessor of room owner's profile
     * @return the room owner's profile
     */
    public String printProfile(){
        return this.profile;
    }


    /**
     * Accessor of the appliance list
     * @return string set of the appliance
     */
    public Set<String> printAppliance(){
        return appliances.keySet();

    }
    
}
