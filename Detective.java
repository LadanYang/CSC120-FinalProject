/**
 * The Detective class has 5 attributes and 12 methods
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/


import java.util.ArrayList;

/**
 * Detective class
 */
public class Detective {
    String name;
    Room location;
    ArrayList<Artifact> backpack;
    Appliance applianceloc;
    int steps = 0;

    /**
     * Constructor of detective class
     * @param String name of the detective
     */
    public Detective(String name){
        /** Name of the detective*/
        this.name=name;
        /** The detective's backpack*/
        this.backpack=new ArrayList<Artifact>();
        /** The appliance which is currently in use*/
        this.applianceloc = null;
    
    }


    /** Manipulator to walk to room and update location
     * @param room the room trying to access
     * @return String the profile of the room's owner
    */
    public String goTo(Room room){
        
        this.location=room;
        System.out.println("You are in "+room.name+" now");
        
        return "<html><p>You are in "+room.name+" now.         "+this.location.printProfile()+"</p></html>";
        
    }

    

    /**
     * Prints out the list of the appliances in a given room
     * @return String the list of the appliance 
     */
    public String lookAround(){
        return "<html><p>There are "+this.location.printAppliance()+"</p></html>";
    }

    /** Adds the item to the bakpack 
     * @param Artifact the item trying to grab
     * @return a message saying if the item is successfully grabbed
    */
    public String grab(Artifact item){
        
        if (this.backpack.contains(item)){
            return "it's already in your bag!";
        }
        this.backpack.add(item);
        return "You just grabed "+item.name;

    }

    
    /** Removes the item to the bakpack 
     * @param Artifact the item trying to drop
     * @return String a message saying if the item is successfully dropped
    */
    public String drop(Artifact item){
        if(this.backpack.contains(item)){
            this.backpack.remove(item);
            return "You just dropped "+item.name;
        }else{
            return item.name+" is not in your backpack!";
        }
    }

    
    /** Examines the artifact by printing its description
     * @param Artifact the item trying to examine
     * @return String the description of the item
    */
    public String examine(Artifact item){
        steps++;
        return "<html><p>Examining "+item.name+"..." + item.getDescription()+"</p></html>";
    }

    
    /** Setter to change the appliance within use, updates applianceloc
     * @param Appliance the appliance trying to go to
     * @return String the list of items in the appliance
    */
    public String goTo(Appliance appliance){
        System.out.print("You are at "+appliance.name+". There are");
        this.applianceloc = appliance;
        if (applianceloc==null){
            return "please use walk to(item) method.";
        }
        return "<html><p>You are at "+appliance.name+". There are "+appliance.printItem()+"</p></html>";

    }
        
    
    /** 
     * Getter prints out contents of backpack
     * @return Sring the contents of backpack
    */
    public String checkBag(){
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<backpack.size();i++){
            System.out.println(backpack.get(i).name);
            String item = backpack.get(i).name;
            sb.append(item);
            sb.append(" ");
        }
       String itemList = sb.toString();
      return itemList;
    }


    
    /** 
     * Prints all the methods
     * @return String all the available options
    */
    public String showOptions() {
        String Options = "<html><p>Available options: go to(appliance), walk to(room), look around, examine(item), grab(item), drop(item), check bag(), declare(suspect), showReport()</p></html>";
        return Options;
      }

      
    
    /** 
     * The method for declaring the murderer
     * @return String a message indicating whether the declare is successful
    */
    public String declare(String declare){
    if(steps>=15){
        System.out.println("Please declare the murderer:");
    if (declare.equalsIgnoreCase("dean")){
        return "<html><p>Congrats! You've caught the murder.</p></html>";
    }
    else{
        return "Wrong! Think twice.";
    }
    
    }
    else{
        int leftSteps= 15-steps;
        return "<html><p>Not sufficient evidence. Cannot declare. Please examine at least 15 items. You still have "+leftSteps+" items to examine.<p><html>";
    }
    }

    /**
     * The method for showing a report in the middle of the game
     * @return String the report
     */
    public String showReport(){
    if(steps>=10){
        return "<html><p>Here's a autopsy report: age between 25-35, blood type-O, breath in lots of anesthetic</p></html>";
    }
    else{
        int reportSteps= 10-steps;
        return "<html><p>No reported received yet. Please examine at least 10 items. You still have "+ reportSteps+" items to examine.<p><html>";
    }
    
    }

    
}
