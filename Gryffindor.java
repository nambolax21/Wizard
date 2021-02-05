public class Gryffindor extends Wizard {
    String[] traits;
    String ghost;
    String[] colors;
    int year;
    String head;

    public Gryffindor(String name, String wandMaterial, String wandLength, String patronus, int y){
        super(name, wandMaterial, wandLength, patronus);
        traits = ["brave", "good"];
        ghost = "St. Nick";
        colors = ["Red", "Gold"];
        year = y;
        head = "McGonagall";
    }

    
}
