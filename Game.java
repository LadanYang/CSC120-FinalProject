import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;

public class Game {
    ArrayList<Room> allRooms;
    public Game(){
        // public void printRooms(){

        //     for(int i=0;i<this.allRooms.size();i++){
        //         System.out.println(this.allRooms.get(i).name);
        //     }
        // }
            
        Hashtable<String, ArrayList<Artifact>> nurseAppliance = new Hashtable<String, ArrayList<Artifact>>();
        Artifact diary=new Artifact("Diary", "poor wage, not enough to buy food and clothes");
        Artifact ring=new Artifact("Wedding ring", "xx");
        ArrayList<Artifact> Table1 = new ArrayList<Artifact>();
        Table1.add(diary);
        Table1.add(ring);
        nurseAppliance.put("table",Table1);
        Room nurseStation = new Room("Nurse Station",nurseAppliance);

        Hashtable<String, ArrayList<Artifact>> investorOfficeAppliance = new Hashtable<String, ArrayList<Artifact>>();
        Artifact shareProspectus=new Artifact("share prospectus", "investor 55%, dean 30%, assistant dean 15%");
        Artifact photo=new Artifact("Photos", "Photos with ex");
        Artifact newspaperA=new Artifact("Newspaper A", "investor inherited 1 billion dollars from parents who died in car ");
        Artifact newspaperB=new Artifact("Newspaper B", "one of the ex died because of dean's surgery failure ");
        ArrayList<Artifact> tableDrawer = new ArrayList<Artifact>();
        tableDrawer.add(shareProspectus);
        tableDrawer.add(photo);
        tableDrawer.add(newspaperA);
        tableDrawer.add(newspaperB);
        Artifact email = new Artifact("email with assistant dean","assistant dean wants to replace dean after his brother disappeared, but investor rejects him because investor likes dean more.");
        ArrayList<Artifact> laptop = new ArrayList<Artifact>();
        laptop.add(email);
        Artifact liquorBottle = new Artifact("liquor bottles",null);
        ArrayList<Artifact> shelf = new ArrayList<Artifact>();
        shelf.add(liquorBottle);
        investorOfficeAppliance.put("table drawer", tableDrawer);
        investorOfficeAppliance.put("laptop", laptop);
        investorOfficeAppliance.put("shelf",shelf);
        Room InvestorOffice = new Room("Investor's Office",investorOfficeAppliance);


        Hashtable<String, ArrayList<Artifact>> wardAppliance = new Hashtable<String, ArrayList<Artifact>>();
        ArrayList<Artifact> bed = new ArrayList<Artifact>();
        Artifact Bed = new Artifact("bed", null);
        bed.add(Bed);
        ArrayList<Artifact> drawer = new ArrayList<Artifact>();
        Artifact newspaper=new Artifact("newspaper", "he and the cleaner are lovers");
        drawer.add(newspaper);
        ArrayList<Artifact> luggage = new ArrayList<Artifact>();
        Artifact phone=new Artifact("phone", "contains a message with his agent: turn down all recent work.");
        luggage.add(phone);
        ArrayList<Artifact> couch = new ArrayList<Artifact>();
        Artifact Couch = new Artifact("couch", null);
        couch.add(Couch);
        ArrayList<Artifact> TV = new ArrayList<Artifact>();
        Artifact tv = new Artifact("TV", null);
        TV.add(tv);
        wardAppliance.put("bed",bed);
        wardAppliance.put("drawer",drawer);
        wardAppliance.put("luggage",luggage);
        wardAppliance.put("couch",couch);
        wardAppliance.put("TV",TV);
        Room patientWard = new Room("Patient's Ward",wardAppliance);


        Hashtable<String, ArrayList<Artifact>> deanAppliance = new Hashtable<String, ArrayList<Artifact>>();
        ArrayList<Artifact> couch1 = new ArrayList<Artifact>();
        ArrayList<Artifact> table = new ArrayList<Artifact>();
        ArrayList<Artifact> bookShelf = new ArrayList<Artifact>();
        ArrayList<Artifact> potPlant = new ArrayList<Artifact>();
        ArrayList<Artifact> corpse = new ArrayList<Artifact>();
        ArrayList<Artifact> Luggage = new ArrayList<Artifact>();
        Artifact bottle = new Artifact("burnt bottle", "medical...");
        Artifact report = new Artifact("surgery report",null);
        Artifact liquor = new Artifact("half bottle of liquor",null);
        Artifact profile = new Artifact("staff profile", "staff profile");
        Artifact weddingRing = new Artifact("wedding ring", null);
        Artifact Corpse = new Artifact("dean's corpse", "there are burnt wallet, burnt dean's id card, and burnt medical gauze on the corpse");
        Artifact letter = new Artifact("letter", "a detective agency asks dean to pay the money for investigating all his staff.");
        Artifact pen = new Artifact("recording pen", "I'm back. Let's meet at 20:00 in my office");
        Artifact phone1 = new Artifact("phone", "There's an email with investor. Investor is mad about the surgery accident of his ex-girlfriend");
        couch1.add(bottle);
        table.add(report);
        table.add(liquor);
        bookShelf.add(profile);
        potPlant.add(weddingRing);
        corpse.add(Corpse);
        Luggage.add(letter);
        Luggage.add(pen);
        Luggage.add(phone1);
        deanAppliance.put("couch", couch1);
        deanAppliance.put("table", table);
        deanAppliance.put("book shelf", bookShelf);
        deanAppliance.put("pot plant", potPlant);
        deanAppliance.put("corpse", corpse);
        deanAppliance.put("luggage", Luggage);
        Room deanOffice = new Room("Dean's Office",deanAppliance);

        this.allRooms=new ArrayList<Room>();
        this.allRooms.add(nurseStation);
        this.allRooms.add(InvestorOffice);
        this.allRooms.add(patientWard);
        this.allRooms.add(deanOffice);

        

        
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
