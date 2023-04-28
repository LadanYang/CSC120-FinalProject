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

    public void walkTo(Room room){
        this.location=room;
        System.out.println("You are in "+room.name+" now");
        this.location.printProfile();
        
    }

    
    /** Prints out the list of the appliances in a given room*/

    public void lookAround(){
        System.out.print("There are ");
        this.location.printItem();
    }

    /** Adds the item to the bakpack 
     * @param Artifact
     * @exception if its already within the backpack
    */
    public void grab(Artifact item){
        if (this.backpack.contains(item)){
            throw new RuntimeException("it's already in your bag!");
        }
        this.backpack.add(item);
        System.out.println("You just grabed "+item.name);
    }

    
    /** Removes the item to the bakpack 
     * @param Artifact
     * @exception if its already not within the backpack
    */
    public void drop(Artifact item){
        if(this.backpack.contains(item)){
            this.backpack.remove(item);
        System.out.println("You just dropped "+item.name);
        }else{
            throw new RuntimeException(item.name+" is not in your backpack!");
        }
    }

    
    /** Examines the artifact by printing its description
     * @param Artifact
    */
    public void examine(Artifact item){
        System.out.println("Examining "+item.name+"...");
        item.getDescription();
        steps++;
    }

    
    /** Setter to change the appliance within use, updates applianceloc
     * @param Appliance
    */

    public void goTo(Appliance appliance){
        System.out.print("You are at "+appliance.name+". There are");
        this.applianceloc = appliance;
        if (applianceloc==null){
            System.out.println("please use walk to(item) method.");
        }
        
        appliance.printItem();
        

    }

    
    /** Getter prints out contents of backpack
    */
    public void checkBag(){
        for (int i=0; i<backpack.size();i++){
            System.out.println(backpack.get(i).name);
        }
    }

    
    // public void getItem(){
    //     for (int i=0; i<backpack.size();i++){
    //         System.out.println(backpack.get(i).name);
    //     }
    // }


    
    /** Prints all the methods
    */
    
    public void showOptions() {
        System.out.println("Available options:");
        System.out.println("+ show rooms");
        System.out.println(" + walk to(room)");
        System.out.println(" + go to(appliance)");
        System.out.println(" + look around");
        System.out.println(" + examine(item)");
        System.out.println(" + grab(item)");
        System.out.println(" + drop(item)");
        System.out.println("+ check bag()");
        System.out.println("+ declare(suspect)");
        System.out.println("+ showReport()");
      }

      
    
    /** The method for declaring the murderer, will print wrong if it is not the correct murderer
    */
    
      public void declare(){
        if(steps>=15){
            System.out.println("Please declare the murderer:");
        Scanner input = new Scanner(System.in);
        String declare = input.nextLine();
        if (declare.equalsIgnoreCase("dean")){
            System.out.println("Congrats! You've caught the murder.");
        }
        else{
            System.out.println("Wrong! Think twice.");
        }
        input.close();
        }
        else{
            System.out.println("Not sufficient evidence. Cannot declare. Please examine at least 10 items.");
        }
      }

      public void showReport(){
        if(steps==10){
            System.out.println("Here's a autopsy report: age between 25-35, blood type-O, breath in lots of anesthetic");
        }
        else{
            System.out.println("No reported received yet. Please examine at least 10 items.");
        }
      }
    
}
