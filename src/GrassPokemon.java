import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "gras";

    List<String> attacks = Arrays.asList("leechSeed", "solarBeam", "leaveBlade", "leafStorm");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);}

    void leechSeed(Pokemon name, Pokemon enemy) { System.out.println();}
    void solarBeam(Pokemon name, Pokemon enemy) { System.out.println();}
    void leaveBlade(Pokemon name, Pokemon enemy) { System.out.println();}
    void leafStorm(Pokemon name, Pokemon enemy) { System.out.println();}

    // constructor-----------------------------------------------------------------------------
    public List<String> getAttacks() {
        return attacks;
    }

    // gettersNsetters-----------------------------------------------------------------------------
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }
}


