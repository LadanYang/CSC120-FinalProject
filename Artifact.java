/**
 * The Artifact class has 2 attributes and 1 method
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/


public class Artifact{
    public String name;
    private String description;
    public Artifact(String name, String description){

        /** The name for this item */
        this.name=name;

        /** The description for this item  */
        this.description=description;

    }

    /** Getter for description of the item 
     * Prints out description
    */
    public String getDescription(){
       //System.out.println (this.description);
       return this.description;
       
    }

}