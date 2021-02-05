public class Wizard {
    private String name;
    private String wandMaterial;
    private String wandLength;
    private String patronus;

    public Wizard(String n, String wM, String wL, String p){
        name = n;
        wandMaterial = wM;
        wandLength = wL;
        patronus = p;
    }

    public String getName(){
        return name;
    }

    public String getWandMaterial(){
        return wandMaterial;
    }

    public String getWandLength(){
        return wandLength;
    }

    public String getPatronus(){
        return patronus;
    }

    public void setName(String n) {
        name = n;
    }

    public void setWandMaterial(String w){
        wandMaterial = w;
    }

    public void setWandLength(String w){
        wandLength = w;
    }

    public void setPatronus(String p){
        patronus = p;
    }

    public boolean Lumos() {
        return true;
    }

}
