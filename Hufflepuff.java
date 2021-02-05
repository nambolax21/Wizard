public class Hufflepuff {
    String[] traits;
    String ghost;
    String[] colors;
    int year;
    String head;

    public Hufflepuff(String name, String wandMaterial, String wandLength, String patronus, int y){
        super(name, wandMaterial, wandLength, patronus);
        traits = ["hard work", "patience", "loyalty"];
        ghost = "Fat Friar";
        colors = ["Yellow", "Black"];
        year = y;
        head = "Pomona Sprout";
    }
    
}
