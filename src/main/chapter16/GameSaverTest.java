import java.io.*;
import java.util.Arrays;

public class GameSaverTest {
    public static void main(String[] args) {

        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "knife", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisiblity"});


        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imagine code that does things with characters that changes their state values
        one.setType("Magical Lion");
        System.out.println("Primal One's type: " + one.getType());
        System.out.println("-".repeat(40));
        

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's type is: " + oneRestore.getType());
            System.out.println("Two's type is: " + twoRestore.getType());
            System.out.println("three's type is: " + threeRestore.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class GameCharacter implements Serializable {
    private final int power;
    private String type;
    private final String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power; 
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapons() {
        return Arrays.toString(weapons);
    }
}
