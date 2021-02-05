public class Ravenclaw {
    String[] traits;
    String ghost;
    String[] colors;
    int year;
    String head;

    public Ravenclaw(String name, String wandMaterial, String wandLength, String patronus, int y){
        super(name, wandMaterial, wandLength, patronus);
        traits = ["intelligence", "wisdom", "wit"];
        ghost = "Helena Ravenclaw";
        colors = ["Bronze", "Blue"];
        year = y;
        head = "Filius Flitwick";
    }
}
