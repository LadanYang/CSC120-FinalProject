import java.util.ArrayList;
import java.util.Scanner;

public class Detective {
    String name;
    Room location;
    ArrayList<Artifact> backpack;
    Appliance applianceloc;
    int steps = 0;

    public Detective(String name){
        this.name=name;
        this.backpack=new ArrayList<Artifact>();
        this.applianceloc = null;
    
    }
    public void goTo(Room room){
        this.location=room;
        System.out.println("You are in "+room.name+" now");
        this.location.printProfile();
        //if (room.)
        
    }
    public void lookAround(){
        System.out.print("There are ");
        this.location.printItem();
    }
    public void grab(Artifact item){
        this.backpack.add(item);
        System.out.println("You just grabed "+item.name);
    }
    public void drop(Artifact item){
        if(this.backpack.contains(item)){
            this.backpack.remove(item);
        System.out.println("You just dropped "+item.name);
        }else{
            throw new RuntimeException(item+" is not in your backpack!");
        }
    }
    public void examine(Artifact item){
        System.out.println("Examining "+item.name+"...");
        item.getDescription();
        steps++;
    }

    public void walkTo(Appliance appliance){
        System.out.print("You are at "+appliance.name+". There are");
        
        if (applianceloc==null){
            System.out.println("please use walk to(item) method.");
        }
        this.applianceloc = appliance;
        appliance.printItem();
        

    }
    public void showOptions() {
        System.out.println("Available options:");
        System.out.println("+ show rooms");
        System.out.println(" + go to(room)");
        System.out.println(" + walk to(appliance)");
        System.out.println(" + look around");
        System.out.println(" + examine(item)");
        System.out.println(" + grab(item)");
        System.out.println(" + drop(item)");
        System.out.println("+ declare(suspect).");

      }

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
    
}
