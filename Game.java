import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.*;

public class Game {
    Hashtable<String, Room> allRooms;
    public Game(){
        // public void printRooms(){

        //     for(int i=0;i<this.allRooms.size();i++){
        //         System.out.println(this.allRooms.get(i).name);
        //     }
        // }
            
        Hashtable<String, Appliance> nurseAppliance = new Hashtable<String, Appliance>();
        Artifact diary=new Artifact("Diary", "poor wage, not enough to buy food and clothes");
        Artifact ring=new Artifact("Wedding ring", "xx");
        Appliance Table1 = new Appliance("Table");
        Table1.put("Diary",diary);
        Table1.put("Ring", ring);
        nurseAppliance.put("Table",Table1);
        Room nurseStation = new Room("Nurse Station",nurseAppliance);

        Hashtable<String, Appliance> investorOfficeAppliance = new Hashtable<String, Appliance>();
        Artifact shareProspectus=new Artifact("share prospectus", "investor 55%, dean 30%, assistant dean 15%");
        Artifact photo=new Artifact("Photos", "Photos with ex");
        Artifact newspaperA=new Artifact("Newspaper A", "investor inherited 1 billion dollars from parents who died in car ");
        Artifact newspaperB=new Artifact("Newspaper B", "one of the ex died because of dean's surgery failure ");
        
        Appliance tableDrawer = new Appliance("Table Drawer");
        tableDrawer.put("Share Prospectus",shareProspectus);
        tableDrawer.put("Photo", photo);
        tableDrawer.put("NewspaperA", newspaperA);
        tableDrawer.put("NewspaperB", newspaperB);
        investorOfficeAppliance.put("Table Drawer",tableDrawer);
        Artifact email = new Artifact("email with assistant dean","assistant dean wants to replace dean after his brother disappeared, but investor rejects him because investor likes dean more.");
        Appliance laptop = new Appliance("Laptop");
        laptop.put("email", email);
        Artifact liquorBottle = new Artifact("liquor bottles",null);
        Appliance shelf = new Appliance("Shelf");
        shelf.put("Liquor Bottle", liquorBottle);
        investorOfficeAppliance.put("table drawer", tableDrawer);
        investorOfficeAppliance.put("laptop", laptop);
        investorOfficeAppliance.put("shelf",shelf);
        Room InvestorOffice = new Room("Investor's Office",investorOfficeAppliance);


        Hashtable<String, Appliance> wardAppliance = new Hashtable<String, Appliance>();
        Appliance bed = new Appliance("Bed");
        Artifact Bed = new Artifact("bed", null);
        bed.put("Bed",Bed);
        Appliance drawer = new Appliance("Drawer");
        Artifact newspaper=new Artifact("newspaper", "he and the cleaner are lovers");
        drawer.put("Newspaper",newspaper);
        Appliance luggage = new Appliance("Luggage");
        Artifact phone=new Artifact("phone", "contains a message with his agent: turn down all recent work.");
        luggage.put("Phone",phone);
        Appliance couch = new Appliance("Couch");
        Artifact Couch = new Artifact("couch", null);
        couch.put("Couch",Couch);
        Appliance TV = new Appliance("TV");
        Artifact tv = new Artifact("TV", null);
        TV.put("TV",tv);
        wardAppliance.put("bed",bed);
        wardAppliance.put("drawer",drawer);
        wardAppliance.put("luggage",luggage);
        wardAppliance.put("couch",couch);
        wardAppliance.put("TV",TV);
        Room patientWard = new Room("Patient's Ward",wardAppliance);


        Hashtable<String, Appliance> deanAppliance = new Hashtable<String, Appliance>();
        Appliance couch1 = new Appliance("Couch");
        Appliance table = new Appliance("Table");
        Appliance bookShelf = new Appliance("Bookshelf");
        Appliance potPlant = new Appliance("Pot plant");
        Appliance corpse = new Appliance("Corpse");
        Appliance Luggage = new Appliance("Luggage");
        Artifact bottle = new Artifact("burnt bottle", "medical...");
        Artifact report = new Artifact("surgery report",null);
        Artifact liquor = new Artifact("half bottle of liquor",null);
        Artifact profile = new Artifact("staff profile", "");
        // "Head nurse
        // bloodType = O;
        // age = 28;
        // gender = female;
        // height = 168cm;
        // weight = 48kg;
        // salary= 5000;
        // description: 18:05 received call from dean, asked to meet at 20:00; 18:10 called assistant dean about dean, meet with assistant dean at 19:50 in the hospital;
        
        // Investor
        // bloodType = O;
        // age = 32;
        // gender = male;
        // height = 178cm;
        // weight = 75kg;
        // description: 18:00 received call from dean; arrived at hospital at 20:00;
        
        // Dean
        // bloodType = A;
        // age = 33;
        // gender = male;
        // height = 179cm; 
        // weight = 76kg;
        // salary= 20000;
        
        // Assistant dean
        // bloodType = O;
        // age = 31;
        // gender = male;
        // height = 177cm;
        // weight = 74kg;
        // salary= 10000;
        // description: he, dean and investor are running the hospital; his brother, the dean, has disappeared a year ago because of a surgery failure that accidentally killed a model; 18:00, dean called him and said he has returned back, asked him to meet at 20:00;
        
        // Cleaner
        // name;
        // bloodType = O;
        // wage = 2000;
        // age = 26;
        // height = 170cm
        // weight = 48kg
        // gender = female;
        // description: heard head nurse talking to assistant dean at 18:10; saw dean wearing a mask returned at 18:30; 19:30 found that dean’s office on fire, dean was dead;
        
        // Patient
        // bloodType = O;
        // age = 28;
        // gender = male;
        // height = 177cm;
        // weight = 75kg;
        // description: The dean gave him a plastic surgery that failed;");
        Artifact weddingRing = new Artifact("wedding ring", null);
        Artifact Corpse = new Artifact("dean's corpse", "there are burnt wallet, burnt dean's id card, and burnt medical gauze on the corpse");
        Artifact letter = new Artifact("letter", "a detective agency asks dean to pay the money for investigating all his staff.");
        Artifact pen = new Artifact("recording pen", "I'm back. Let's meet at 20:00 in my office");
        Artifact phone1 = new Artifact("phone", "There's an email with investor. Investor is mad about the surgery accident of his ex-girlfriend");
        couch1.put("Bottle",bottle);
        table.put("Report",report);
        table.put("Liquor",liquor);
        bookShelf.put("Profile",profile);
        potPlant.put("Wedding Ring",weddingRing);
        corpse.put("Corpse",Corpse);
        Luggage.put("Letter",letter);
        Luggage.put("Pen",pen);
        Luggage.put("Phone",phone1);
        deanAppliance.put("couch", couch1);
        deanAppliance.put("table", table);
        deanAppliance.put("book shelf", bookShelf);
        deanAppliance.put("pot plant", potPlant);
        deanAppliance.put("corpse", corpse);
        deanAppliance.put("luggage", Luggage);
        Room deanOffice = new Room("Dean's Office",deanAppliance);

        this.allRooms=new Hashtable<String,Room>();
        this.allRooms.put("Nurse Station",nurseStation);
        this.allRooms.put("Investor's Office",InvestorOffice);
        this.allRooms.put("Patient's Ward",patientWard);
        this.allRooms.put("Dean's Office",deanOffice);

        
    }
    public void printRoom(){
        System.out.println("The rooms you can go to are:");

        // for(int i=0;i<this.allRooms.size();i++){
        //     System.out.print(this.allRooms.get(i).name+", ");
        // }
        System.out.println(allRooms.keySet());
        System.out.println("");
    }
    public static void main(String[] args){
        Game trial = new Game();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sharlock Homles! In this game, you are a detective in a crime scene. You need to explore the space to find clues and figure out what happened. Now, what name do you want to use?");
        String nameD = input.nextLine(); 
        Detective detective = new Detective(nameD);
        detective.goTo(trial.allRooms.get("Patient's Ward"));
        while (true){
            System.out.println("");
            System.out.println(detective.name+", what do you want to do next? Call 'showOptions' to see the availble actions");
            String response = input.nextLine(); 
            String[] res_words = response.split(" ");
            List list_words = Arrays.asList(res_words);
            int num_words = list_words.size();
            if (list_words.contains("show Options")){
                detective.showOptions();
            }
            if (response.equals("show rooms")){
                trial.printRoom();
            }
            if (response.equals("look around")){
                detective.lookAround();
            }
            if(response.equals("quit")){
                break;
            }
            if(list_words.contains("go")){
                String loc = res_words[num_words-2] +" " + res_words[num_words-1];
                System.out.println(loc);
                detective.goTo(trial.allRooms.get(loc));
            }
            if(list_words.contains("walk")){
                
                detective.walkTo(detective.location.appliances.get(res_words[num_words-1]));;
                
            }
            if(list_words.contains("examine")){
                
                detective.examine(detective.applianceloc.items.get(res_words[num_words-1]));;
                
            }
            if(list_words.contains("grab")){
                
                detective.grab(detective.applianceloc.items.get(res_words[num_words-1]));;
                
            }
            if(list_words.contains("drop")){
                
                detective.drop(detective.applianceloc.items.get(res_words[num_words-1]));;
                
            }
            // if(res_words[0].equals("drop")){
            //     int idx = detective.location.items.indexOf(res_words[1]);
            //     detective.drop(detective.location.items.get(idx));
            // }
        }
        
        input.close();
        detective.lookAround();
        //int idx = detective.location.items.indexOf("Drawer");
        //detective.examine(detective.location.items.get(0));
        
    }
}
