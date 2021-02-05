public class Slytherin extends Wizard {
    String[] traits;
    String ghost;
    String[] colors;
    int schoolYear;

    public Slytherin(String name, String wandMaterial, String wandLength, String patronus, int y){
        super(name, wandMaterial, wandLength, patronus);
        traits = ["cunning", "ambitious"];
        ghost = "";
        colors = ["Green", "Silver"];
        year = y;
        head = "Snape";
    }
}
