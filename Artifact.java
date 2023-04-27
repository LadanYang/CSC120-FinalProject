public class Artifact{
    public String name;
    private String description;
    public Artifact(String name, String description){
        this.name=name;
        this.description=description;

    }
    public void getDescription(){
       System.out.println (this.description);
       
    }

}