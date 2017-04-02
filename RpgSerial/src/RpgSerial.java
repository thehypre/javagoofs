import java.io.*;

public class RpgSerial {
    public static void main(String[] args){
        Hero h1 = new Hero(100,"Knight",new String[]{"Sword", "Shield"});
        Hero h2 = new Hero(150,"Mage", new String[]{"Wand", "Spellbook"});
        Hero h3 = new Hero(75,"Rogue", new String[]{"Dagger", "Smokebomb"});

        //gameplay altering heroes stats
        //then we save our adventurers

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("gra.save"));
            os.writeObject(h1);
            os.writeObject(h2);
            os.writeObject(h3);
            os.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        //reset of heroes stats

        h1 = null;
        h2 = null;
        h3 = null;

        //loading of save

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("gra.save"));
            Hero h1N = (Hero) is.readObject();
            Hero h2N = (Hero) is.readObject();
            Hero h3N = (Hero) is.readObject();

            System.out.println("Hero 1 class: " + h1N.getHClass());
            System.out.println("Hero 2 class: " + h2N.getHClass());
            System.out.println("Hero 3 class: " + h3N.getHClass());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
