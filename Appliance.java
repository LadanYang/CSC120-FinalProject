import java.util.ArrayList;

public class Appliance {
    String name;
    ArrayList<Artifact> items;
    public Appliance(String name, ArrayList<Artifact> items){
        this.name=name;
        this.items = items;

    }

    public void examine(){
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }
    }
}
