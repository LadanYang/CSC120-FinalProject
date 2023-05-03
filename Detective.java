/**
 * The Detective class has 5 attributes and 12 methods
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/


import java.util.ArrayList;
import java.util.Scanner;

public class Detective {
    String name;
    Room location;
    ArrayList<Artifact> backpack;
    Appliance applianceloc;
    int steps = 0;

    
    public Detective(String name){
        /** Name of the detective*/
        this.name=name;
        /** The detective's backpack*/
        this.backpack=new ArrayList<Artifact>();
        /** The appliance which is currently in use*/
        this.applianceloc = null;
    
    }


    /** Manipulator to walk to room and update location
     * @param room
    */

    public String walkTo(Room room){
        
        this.location=room;
        System.out.println("You are in "+room.name+" now");
        
        return "<html><p>You are in "+room.name+" now.         "+this.location.printProfile()+"</p></html>";
        
    }

    
    /** Prints out the list of the appliances in a given room*/

    public String lookAround(){
        // System.out.print("There are ");
        // this.location.printAppliance();
        return "<html><p>There are "+this.location.printAppliance()+"</p></html>";
    }

    /** Adds the item to the bakpack 
     * @param Artifact
     * @exception if its already within the backpack
    */
    public String grab(Artifact item){
        
        if (this.backpack.contains(item)){
            //throw new RuntimeException("it's already in your bag!");
            return "it's already in your bag!";
        }
        this.backpack.add(item);
        //System.out.println("You just grabed "+item.name);
        return "You just grabed "+item.name;
        //return this.backpack.toString();
    }

    
    /** Removes the item to the bakpack 
     * @param Artifact
     * @exception if its already not within the backpack
    */
    public String drop(Artifact item){
        if(this.backpack.contains(item)){
            this.backpack.remove(item);
        //System.out.println("You just dropped "+item.name);
        return "You just dropped "+item.name;
        }else{
            return item.name+" is not in your backpack!";
            //throw new RuntimeException(item.name+" is not in your backpack!");
        }
    }

    
    /** Examines the artifact by printing its description
     * @param Artifact
    */
    public String examine(Artifact item){
        // System.out.println("Examining "+item.name+"...");
        // item.getDescription();
        steps++;
        return "<html><p>Examining "+item.name+"..." + item.getDescription()+"</p></html>";
    }

    
    /** Setter to change the appliance within use, updates applianceloc
     * @param Appliance
    */

    public String goTo(Appliance appliance){
        System.out.print("You are at "+appliance.name+". There are");
        this.applianceloc = appliance;
        if (applianceloc==null){
            //System.out.println("please use walk to(item) method.");
            return "please use walk to(item) method.";
        }
        
        //appliance.printItem();
        return "<html><p>You are at "+appliance.name+". There are "+appliance.printItem()+"</p></html>";

    }
        
    
    /** Getter prints out contents of backpack
    */
    public String checkBag(){
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<backpack.size();i++){
            System.out.println(backpack.get(i).name);
            String s = backpack.get(i).name;
            sb.append(s);
            sb.append(" ");
            //String names = backpack.get(i).name;
        }
       String str = sb.toString();
      return str;
    }

    
    // public void getItem(){
    //     for (int i=0; i<backpack.size();i++){
    //         System.out.println(backpack.get(i).name);
    //     }
    // }


    
    /** Prints all the methods
    */
    
    public String showOptions() {
        String Options = "<html><p>Available options: go to(appliance), walk to(room), look around, examine(item), grab(item), drop(item), check bag(), declare(suspect), showReport()</p></html>";
        return Options;
      }

      
    
    /** The method for declaring the murderer, will print wrong if it is not the correct murderer
    */
    
      public String declare(String declare){
        if(steps>=15){
            System.out.println("Please declare the murderer:");
        // Scanner input = new Scanner(System.in);
        // String declare = input.nextLine();
        if (declare.equalsIgnoreCase("dean")){
            //System.out.println("Congrats! You've caught the murder.");
            return "Congrats! You've caught the murder.";
        }
        else{
            //System.out.println("Wrong! Think twice.");
            return "Wrong! Think twice.";
        }
        
        }
        else{
            //System.out.println("Not sufficient evidence. Cannot declare. Please examine at least 10 items.");
            return "Not sufficient evidence. Cannot declare. Please examine at least 15 items.";
        }
      }

      public String showReport(){
        if(steps>=10){
            return "<html><p>Here's a autopsy report: age between 25-35, blood type-O, breath in lots of anesthetic</p></html>";
        }
        else{
            return "No reported received yet. Please examine at least 10 items.";
        }
        
      }
    
    
}
