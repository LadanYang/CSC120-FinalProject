import java.util.ArrayList;

public class Room {
    ArrayList<Artifact> items;
    public String name;

    public Room(String name, ArrayList items){
        this.name=name;
        this.items=items;

    }
    public void printItem(){
        for(int i=0;i<this.items.size();i++){
            System.out.print(this.items.get(i).name+", ");
        }System.out.println("");

    }

}
