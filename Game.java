
/**
 * The Game class builds the environment, has one method, and has the main method where gameplay occurs
 * @author Clara Yang, Quinn He, Yaya Callahan
 * @version 04/28/23
 **/

import java.util.Scanner;
import java.util.Hashtable;
import java.util.*;
import java.lang.*;
import java.util.Set;

public class Game {
    Hashtable<String, Room> allRooms;

    public Game(){
        // public void printRooms(){

        //     for(int i=0;i<this.allRooms.size();i++){
        //         System.out.println(this.allRooms.get(i).name);
        //     }
        // }
            
        Hashtable<String, Appliance> nurseAppliance = new Hashtable<String, Appliance>();
        Artifact diary=new Artifact("diary", "poor wage, not enough to buy food and clothes");
        Artifact ring=new Artifact("ring", "a diamond wedding ring");
        Appliance Table1 = new Appliance("table");
        Table1.put("diary",diary);
        Table1.put("ring", ring);
        nurseAppliance.put("table",Table1);
        Room nurseStation = new Room("Nurse Station",nurseAppliance, "Head nurse: bloodType = O; 28 years old; female; 168cm, 48kg; salary= 5000; description: 18:05 received call from dean, asked to meet at 20:00; 18:10 called assistant dean about dean, meet with assistant dean at 19:50 in the hospital.");

        Hashtable<String, Appliance> investorOfficeAppliance = new Hashtable<String, Appliance>();
        Artifact shareProspectus=new Artifact("share prospectus", "investor 55%, dean 30%, assistant 15%");
        Artifact photo=new Artifact("photos", "Photos with ex");
        Artifact newspaperA=new Artifact("newspaper A", "investor inherited 1 billion dollars from parents who died in car ");
        Artifact newspaperB=new Artifact("newspaper B", "one of the ex died because of dean's surgery failure ");
        Appliance tableDrawer = new Appliance("drawer");
        tableDrawer.put("prospectus",shareProspectus);
        tableDrawer.put("photo", photo);
        tableDrawer.put("newspaperA", newspaperA);
        tableDrawer.put("newspaperB", newspaperB);
        investorOfficeAppliance.put("drawer",tableDrawer);
        Artifact email = new Artifact("email with assistant","assistant wants to replace dean after his brother disappeared, but investor rejects him because investor likes dean more.");
        Appliance laptop = new Appliance("laptop");
        laptop.put("email", email);
        Artifact liquorBottle = new Artifact("liquor bottles","a liquor bottle");
        Appliance shelf = new Appliance("Shelf");
        shelf.put("liquor", liquorBottle);
        investorOfficeAppliance.put("drawer", tableDrawer);
        investorOfficeAppliance.put("laptop", laptop);
        investorOfficeAppliance.put("shelf",shelf);
        Room InvestorOffice = new Room("Investor's Office",investorOfficeAppliance, "Investor: bloodType = O; 32 years old; male; 178cm, 75kg; description: 18:00 received call from dean; arrived at hospital at 20:00.");


        Hashtable<String, Appliance> wardAppliance = new Hashtable<String, Appliance>();
        Appliance bed = new Appliance("bed");
        Artifact Bed = new Artifact("bed", "nothing");
        bed.put("bed",Bed);
        Appliance drawer = new Appliance("drawer");
        Artifact newspaper=new Artifact("newspaper", "patient and the cleaner are lovers");
        drawer.put("newspaper",newspaper);
        Appliance luggage = new Appliance("luggage");
        Artifact phone=new Artifact("phone", "contains a message with his agent: turn down all recent work.");
        luggage.put("phone",phone);
        Appliance couch = new Appliance("couch");
        Artifact Couch = new Artifact("couch", "nothing");
        couch.put("couch",Couch);
        Appliance TV = new Appliance("tv");
        Artifact tv = new Artifact("tv", "just a tv");
        TV.put("tv",tv);
        wardAppliance.put("bed",bed);
        wardAppliance.put("drawer",drawer);
        wardAppliance.put("luggage",luggage);
        wardAppliance.put("couch",couch);
        wardAppliance.put("tv",TV);
        Room patientWard = new Room("Patient's Ward",wardAppliance, "Patient: bloodType = O; 28 years old; male; 177cm, 75kg; description: The dean gave him a plastic surgery that failed.");


        Hashtable<String, Appliance> deanAppliance = new Hashtable<String, Appliance>();
        Appliance couch1 = new Appliance("couch");
        Appliance table = new Appliance("table");
        Appliance bookShelf = new Appliance("bookshelf");
        Appliance potPlant = new Appliance("plant");
        Appliance corpse = new Appliance("corpse");
        Appliance Luggage = new Appliance("luggage");
        Artifact bottle = new Artifact("burnt bottle", "a burnt bottle says: medical...");
        Artifact report = new Artifact("surgery report","patient's surgery report");
        Artifact liquor = new Artifact("half bottle of liquor","half bottle of liquor");
        Artifact profile = new Artifact("profile", "profile is displayed at the entry of each room");
        Artifact weddingRing = new Artifact("ring", "wedding ring");
        Artifact Corpse = new Artifact("dean's corpse", "there are burnt wallet, burnt dean's id card, and burnt medical gauze on the corpse");
        Artifact letter = new Artifact("letter", "a detective agency asks dean to pay the money for investigating all his staff.");
        Artifact pen = new Artifact("recording pen", "I'm back. Let's meet at 20:00 in my office");
        Artifact phone1 = new Artifact("phone", "There's an email with investor. Investor is mad about the surgery accident of his ex-girlfriend");
        couch1.put("bottle",bottle);
        table.put("report",report);
        table.put("liquor",liquor);
        bookShelf.put("profile",profile);
        potPlant.put("ring",weddingRing);
        corpse.put("corpse",Corpse);
        Luggage.put("letter",letter);
        Luggage.put("pen",pen);
        Luggage.put("phone",phone1);
        deanAppliance.put("couch", couch1);
        deanAppliance.put("table", table);
        deanAppliance.put("bookshelf", bookShelf);
        deanAppliance.put("plant", potPlant);
        deanAppliance.put("corpse", corpse);
        deanAppliance.put("luggage", Luggage);
        Room deanOffice = new Room("Dean's Office",deanAppliance, "Dean: bloodType = A; 33 years old; male; 179cm, 76kg; salary= 20000.");


        Hashtable<String, Appliance> cleanerAppliance = new Hashtable<String, Appliance>();
        Appliance closet = new Appliance("closet");
        Appliance table1 = new Appliance("table");
        Appliance box = new Appliance("box");
        Appliance drawer1 = new Appliance("drawer");
        cleanerAppliance.put("closet", closet);
        cleanerAppliance.put("table", table1);
        cleanerAppliance.put("box", box);
        cleanerAppliance.put("drawer", drawer1);
        Artifact poster=new Artifact("posters", "Posters of a film. Protagonist is a patient");
        Artifact photos=new Artifact("photos", "Photos of the cleaner. She looks beautiful.");
        Artifact deliveryForms=new Artifact("delivery", "empty delivery forms. Seems to be to steal and sell things from the hospital");
        Artifact lvBag=new Artifact("bag", "a lv handbag");
        Artifact creditCards=new Artifact("cards", "An assortment of credit cards");
        Artifact facialmask=new Artifact("mask", "A nurses surgical mask");
        Artifact prosthetics=new Artifact("prosthetic", "A prosthetic hand");
        closet.put("poster",poster);
        table1.put("photos",photos);
        drawer1.put("delivery", deliveryForms);
        drawer1.put("bag", lvBag);
        drawer1.put("cards", creditCards);
        box.put("mask", facialmask);
        box.put("prosthetics", prosthetics);
        Room cleanersDorm = new Room("Cleaner's Dorm",cleanerAppliance,"Cleaner: bloodType = O; wage = 2000; 26 years old; 170cm, 48kg; female; description: heard head nurse talking to assistant dean at 18:10; saw dean wearing a mask returned at 18:30; 19:30 found that dean's office on fire, dean was dead.");


        Hashtable<String, Appliance> astdeanAppliance = new Hashtable<String, Appliance>();
        Appliance astdeansDrawer= new Appliance("drawer");
        Appliance astdeansTable= new Appliance("table");
        Appliance astdeansShelf = new Appliance("shelf");
        Appliance astdeansLaptop= new Appliance("laptop");
        astdeanAppliance.put("drawer", astdeansDrawer);
        astdeanAppliance.put("table",  astdeansTable);
        astdeanAppliance.put("shelf",  astdeansShelf);
        astdeanAppliance.put("laptop",  astdeansLaptop);
        Artifact diary1=new Artifact("diary", "living in the shadow of dean; hate dean; a bottle of medical anesthetic");
        Artifact anasthetic=new Artifact("anasthetic", "medical anasthetic");
        Artifact tissueBox=new Artifact("tissues", "tissue box with key to drawer inside");
        Artifact paperCrane=new Artifact("crane", "Paper crane. The assistant must like the nurse");
        Artifact email1=new Artifact("email", "email with investor(assistant wants to replace dean; unsatisfied about the share allocation; request rejected)");
        astdeansDrawer.put("diary", diary1);
        astdeansDrawer.put("anasthetic", anasthetic);
        astdeansTable.put("tissues",tissueBox);
        astdeansShelf.put("crane", paperCrane);
        astdeansLaptop.put("email", email1);
        Room astDeansOffice = new Room("Assistant's Office",astdeanAppliance, "Assistant: bloodType = O; 31 years old; male; 177cm, 74kg; salary= 10000; description: he, dean and investor are running the hospital; his brother, the dean, has disappeared a year ago because of a surgery failure that accidentally killed a model; 18:00, dean called him and said he has returned back, asked him to meet at 20:00.");


        
        Hashtable<String, Appliance> cleaningAppliance = new Hashtable<String,Appliance>();
        Appliance cleaningShelf= new Appliance("shelf");
        Appliance cleaningTrolley= new Appliance("trolley");
        Artifact gauze=new Artifact("gauze", "medical gauze");
        Artifact anasthetic1=new Artifact("anasthetic", "medical anasthetic");
        Artifact lighter=new Artifact("lighter", "null");
        cleaningShelf.put("gauze", gauze);
        cleaningShelf.put("anasthetic", anasthetic1);
        cleaningTrolley.put("lighter", lighter);
        cleaningAppliance.put("shelf", cleaningShelf);
        cleaningAppliance.put("trolley",  cleaningTrolley);
        Room cleaningRoom = new Room("Cleaning Room",cleaningAppliance,"Cleaner: bloodType = O; wage = 2000; 26 years old; 170cm, 48kg; female; description: heard head nurse talking to assistant dean at 18:10; saw dean wearing a mask returned at 18:30; 19:30 found that dean's office on fire, dean was dead.");


        this.allRooms=new Hashtable<String,Room>();
        this.allRooms.put("nurse station",nurseStation);
        this.allRooms.put("investor's office",InvestorOffice);
        this.allRooms.put("patient's ward",patientWard);
        this.allRooms.put("dean's office",deanOffice);
        this.allRooms.put("cleaner's dorm",cleanersDorm);
        this.allRooms.put("assistant's office",astDeansOffice);
        this.allRooms.put("cleaning room",cleaningRoom);

        
    }

    
    /** Getter to print all rooms 
    */


    public String printRoom() {
        System.out.println("The rooms you can go to are:");

        // for(int i=0;i<this.allRooms.size();i++){
        // System.out.print(this.allRooms.get(i).name+", ");
        // }
        System.out.println(allRooms.keySet());
        System.out.println("");
        return "The rooms you can go to are:" + allRooms.keySet();
    }

    public static void main(String[] args) {
        MyGUI GUI=new MyGUI();
        Game trial = new Game();
        // Scanner input = new Scanner(System.in);
        // System.out.println("Welcome to the Sharlock Homles! In this game, you are a detective in a crime scene. You need to explore the space to find clues and figure out what happened.");
        // System.out.println("On 2016.5.20, the cosmetic surgery hospital was on fire. The dead body of the dean was found by a cleaner in the dean's office whose upper body is charred. ");
        // System.out.println("Now, what name do you want to use?");
        // String nameD = input.nextLine();
        Detective detective = new Detective("player");
        detective.goTo(trial.allRooms.get("patient's ward"));
        // String response = null;
        // String[] res_words = null;
        while (true) {
            //System.out.println(detective.location.name);
            // System.out.println("");
            // System.out.println(detective.name + ", what do you want to do next? Call 'show options' to see the availble actions");
            String response = GUI.getCommand().toLowerCase();
            String[] res_words = response.split(" ");
            List list_words = Arrays.asList(res_words);
            int num_words = list_words.size();
            if(GUI.getCommandState()){
                //System.out.print("HUISDHUIGFIG");
                
                // if (response.contains("show options")) {
                //     GUI.changeText(detective.showOptions());
                //     GUI.restoreCommandState();
                // } else if (response.equals("show rooms")) {
                //     GUI.changeText(trial.printRoom());
                //     GUI.restoreCommandState();
                // } else 
                if (response.equals("look around")) {
    
                    try{
                        GUI.changeText(detective.lookAround());
                        GUI.restoreCommandState();
                    }catch(Exception e){
                        GUI.changeText("cannot look around! Make sure you're in a room first.");
                        GUI.restoreCommandState();
                    }

                    
                } else if (response.equals("quit")) {
                    break;
                } else if (list_words.contains("go")&& list_words.contains("dorm")|| list_words.contains("office") || list_words.contains("ward")||list_words.contains("station")||list_words.contains("room")) {
                    String loc = res_words[num_words - 2] + " " + res_words[num_words - 1];
                    
                    // System.out.println(loc);
                    try{
                        //detective.walkTo(trial.allRooms.get(loc));
                        if(trial.allRooms.get(loc) instanceof Room){
                            GUI.changeText(detective.goTo(trial.allRooms.get(loc)));

                            GUI.restoreCommandState();
                            response=null;
                            res_words=null;
                        }else{
                            GUI.changeText("You can only walk to appliances");
                        }
                        
                    }
                    catch(Exception e){
                        GUI.changeText("cannot use walk to! see available options in show options()");
                        GUI.restoreCommandState();
                        //System.out.println("cannot use walk to! see available options in show options()");
                    }

                } else if (list_words.contains("go")) {

                    try{
                        //detective.goTo(detective.location.appliances.get(res_words[num_words - 1]));
                        GUI.changeText(detective.goTo(detective.location.appliances.get(res_words[num_words - 1])));
                        GUI.restoreCommandState();
                    }
                    catch(Exception e){
                        GUI.changeText("cannot use go to! see available options in show options()");
                        GUI.restoreCommandState();
                        //System.out.println("cannot use go to! see available options in show options()");
                    }
                    

                } else if (list_words.contains("examine")) {

                    try{
                        detective.examine(detective.applianceloc.items.get(res_words[1]));
                        GUI.changeText(detective.examine(detective.applianceloc.items.get(res_words[1])));
                        GUI.restoreCommandState();
                        //detective.examine(detective.applianceloc.items.get(res_words[num_words - 1]));
                    }
                    catch (Exception e){
                        GUI.changeText("cannot examine! use other options in show options()!");
                        GUI.restoreCommandState();
                        //System.out.println("cannot examine! use other options in show options()!");
                    }
                    

                } else if (list_words.contains("grab")) {
                    try{
                    //detective.grab(detective.applianceloc.items.get(res_words[num_words - 1]));
                    //detective.grab(detective.applianceloc.items.get(response.substring(response.lastIndexOf("grab")+1)));
                    GUI.changeText(detective.grab(detective.applianceloc.items.get(res_words[num_words - 1])));
                    GUI.restoreCommandState();
                }
                    catch(Exception e){
                        //System.out.println(e);
                        GUI.changeText("You have to use 'go to' to get to the appliance before examine/grab item.");
                        GUI.restoreCommandState();
                    }

                    

                } else if (list_words.contains("drop")) {
                    try{
                    //detective.drop(detective.applianceloc.items.get(res_words[num_words - 1]));
                    GUI.changeText(detective.drop(detective.applianceloc.items.get(res_words[num_words - 1])));
                    GUI.restoreCommandState();
                }
                    catch(Exception e){
                        System.out.println(e);
                        GUI.changeText(e.getMessage());
                        GUI.restoreCommandState();
                    }
                }
                else if(list_words.contains("check")){
                    try{
                        GUI.changeText(detective.checkBag());
                        GUI.restoreCommandState();
                }
                catch(Exception e){
                    GUI.changeText("Backpack is empty, please add first...");
                    GUI.restoreCommandState();
                    //System.out.println(e);
                }
            }

                else if (list_words.contains("declare")) {
                    
                    try{
                        GUI.changeText(detective.declare(res_words[num_words - 1]));
                        GUI.restoreCommandState();
                    }
                    catch(Exception e){
                        // GUI.changeText("");
                        // GUI.restoreCommandState();
                        System.out.println(e);
                    }
                    
                }
                else if (list_words.contains("report"))
                {
                    try{
                        GUI.changeText(detective.showReport());
                        GUI.restoreCommandState();
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    
                }
                
                else {
                    GUI.changeText("<html><p>I don't understand your command. Call 'show options' to view excutable actions. </p></html>");
                    System.out.println("I don't understand your command. Call 'show options' to view excutable actions. ");
                    GUI.restoreCommandState();
                }
                //response=null;
                 res_words=null;
            }
        }
        

    }
}
