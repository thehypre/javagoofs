import java.io.Serializable;

public class Hero implements Serializable {
    private int power;
    private String HClass;
    private String[] equipment;

    public Hero(int p, String c, String[] e){
        power = p;
        HClass = c;
        equipment = e;
    }

    public int getPower(){
        return power;
    }

    public String getHClass(){
        return HClass;
    }

    public String getEquipment() {
        String listOfEquipment = "";
        for (String l : equipment) {
            listOfEquipment += l + " ";
        }
        return listOfEquipment;
    }
}
