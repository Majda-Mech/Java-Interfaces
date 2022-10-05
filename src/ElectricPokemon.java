import java.util.Arrays;
import java.util.List;

public abstract class ElectricPokemon extends Pokemon {

    private static final String type = "Electric";

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "Uses electroBall" + enemy.getName() + "gets hit" + enemy.getHp());
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println("Uses Thunder");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println("voltTackle");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println("hits with thunder punch");
    }

    // constructor-----------------------------------------------------------------------------

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    // gettersNsetters-----------------------------------------------------------------------------

    public List<String> getAttacks() {
        return attacks;
    }
}

