import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    ArrayList<Room> allRooms;
    public Game(){
        // public void printRooms(){

        //     for(int i=0;i<this.allRooms.size();i++){
        //         System.out.println(this.allRooms.get(i).name);
        //     }
        // }
            
        
    
        Artifact diary=new Artifact("Diary", "poor wage, not enough to buy food and clothes");
        Artifact ring=new Artifact("Wedding ring", "xx");
        ArrayList<Artifact> Nurse = new ArrayList<Artifact>();
        Nurse.add(diary);
        Nurse.add(ring);
        Room nurseStation = new Room("Nurse Station",Nurse);

        Artifact table=new Artifact("Table Drawer", "share prospectus(investor 55%, dean 30%, assistant dean 15%)");
        Artifact photo=new Artifact("Photos", "Photos with ex");
        Artifact newspaperA=new Artifact("Newspaper A", "investor inherited 1 billion dollars from parents who died in car ");
        Artifact newspaperB=new Artifact("Newspaper B", "one of the ex died because of dean’s surgery failure ");
        ArrayList<Artifact> Investor = new ArrayList<Artifact>();
        Investor.add(table);
        Investor.add(photo);
        Investor.add(newspaperA);
        Investor.add(newspaperB);
        Room InvestorOffice = new Room("Investor's Office",Investor);

        Artifact drawer=new Artifact("Drawer", "a newspaper suggesting he and cleaner are lovers");
        Artifact luggage=new Artifact("Luggage", "a phone(message with agent: turn down all recent work because of facial paralysis)");
        ArrayList<Artifact> Patient = new ArrayList<Artifact>();
        Patient.add(drawer);
        Patient.add(luggage);
        Room patientWard = new Room("Patient's Ward",Patient);

        this.allRooms=new ArrayList<Room>();
        this.allRooms.add(patientWard);

        

        
    }
    public static void main(String[] args){
        Game trial = new Game();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sharlock Homles! In this game, you are a detective in a crime scene. You need to explore the space to find clues and figure out what happened. Now, what name do you want to use?");
        String nameD = input.nextLine(); 
        Detective detective = new Detective(nameD);
        detective.goTo(trial.allRooms.get(0));
        while (true){
            System.out.println(detective.name+", what do you want to do? Call 'showOptions' to see the availble actions");
            String response = input.nextLine(); 
            String[] res_words = response.split(" ");
            if (response.equals("showOptions")){
                detective.showOptions();
            }
            if (response.equals("lookAround")){
                detective.lookAround();
            }
            if(response.equals("quit")){
                break;
            }
            // if(res_words[0]=="goTo"){
            //     detective.goTo(res_words[1]);
            // }
            if(res_words[0].equals("grab")){
                //detective.grab(drawer);
                int idx = detective.location.items.indexOf(res_words[1]);
                detective.grab(detective.location.items.get(idx));
            }
            if(res_words[0].equals("drop")){
                int idx = detective.location.items.indexOf(res_words[1]);
                detective.drop(detective.location.items.get(idx));
            }
        }
        
        
        detective.lookAround();
        //int idx = detective.location.items.indexOf("Drawer");
        detective.examine(detective.location.items.get(0));
        
    }
}
