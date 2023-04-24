import java.util.ArrayList;

public class Detective {
    String name;
    Room location;
    ArrayList<Artifact> backpack;
    Appliance applianceloc;
    public Detective(String name){
        this.name=name;
        this.backpack=new ArrayList<Artifact>();
        this.applianceloc = null;

    }
    public void goTo(Room room){
        this.location=room;
        System.out.println("You are in "+room.name+" now");
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
    }
    public void walkTo(Appliance appliance){
        System.out.print("You are at "+appliance.name+". There are");
        this.applianceloc = appliance;
        appliance.printItem();

    }
    public void showOptions() {
        System.out.println("Available options:");
        System.out.println(" + go to(room)");
        System.out.println(" + look around");
        System.out.println(" + examine(item)");
        System.out.println(" + grab(item)");
        System.out.println(" + drop(item)");

      }

    
}
