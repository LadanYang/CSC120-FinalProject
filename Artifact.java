/**
 * The Artifact class has 2 attributes and 1 method
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/

/**
 * Artifact class
 */
public class Artifact{
    public String name;
    private String description;
    /**
     * Constructor of artifact class
     * @param String name of the artifact
     * @param String description of the artifact
     */
    public Artifact(String name, String description){

        /** The name for this item */
        this.name=name;

        /** The description for this item  */
        this.description=description;

    }

    /** 
     * Getter for description of the item 
     * @return the description of the item
    */
    public String getDescription(){
       return this.description;
       
    }

}