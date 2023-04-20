import java.util.ArrayList;

public class Detective {
    String name;
    Room location;
    ArrayList<Artifact> backpack;
    public Detective(String name){
        this.name=name;
        this.backpack=new ArrayList<Artifact>();

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
        this.backpack.remove(item);
        System.out.println("You just dropped "+item.name);
    }
    public void examine(Artifact item){
        System.out.println("Examining "+item.name+"...");
        item.getDescription();
    }
    public void showOptions() {
        System.out.println("Available options:");
        System.out.println(" + goTo(room)");
        System.out.println(" + lookAround()");
        System.out.println(" + examine(item)");
        System.out.println(" + grab(item)");
        System.out.println(" + drop(item)");

      }

    
}
