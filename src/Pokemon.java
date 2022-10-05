import java.util.Arrays;
import java.util.List;

public abstract class Pokemon implements PokemonGym {

    //abstract super klasse met 5 private final variablen
    private final String type;
    private final String name;
    private int level;
    private int hp;
    private final String food;
    private final String sound;

    //constructor
    public Pokemon(String type, String name, int level, int hp, String food, String sound) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }
}

//
//    List<String> attacks = Arrays.asList("surf", "fireLash", "leafStorm", "hydroPump", "thunderPnch", "electroBall","solarBeam", "flameThrower", "hydroCanon", "pyroBall", "thunder", "rainDance", "leechSeed", "leaveBlade", "inferno", "voltTackle");
//
//    public List<String> getAttacks() {
//        return attacks;
//    }
//    public void setAttacks(List<String> attacks) {
//        this.attacks = attacks;
//    }
//}