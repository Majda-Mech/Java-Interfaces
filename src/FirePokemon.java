import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "Fire";

    List<String> attacks = Arrays.asList("inferno", "pyroball", "firelash","flamethrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);}

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println("Lashes Fires");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println("test1");
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println("test2");
    }
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println("test3");
    }

    //connstructor-----------------------------------------------------------------------------
    public List<String> getAttacks() {
        return attacks;
    }

    // gettersNsetters-----------------------------------------------------------------------------
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    @Override
    public void enteredTheGym(PokemonTrainer player1) {

    }

    @Override
    public void printPokemon(List<Pokemon> pokemons) {

    }

    @Override
    public Pokemon selectPokemon(String pokemon, PokemonTrainer trainer) {
        return null;
    }

    @Override
    public void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon) {

    }

    @Override
    public Pokemon chooseGymPokemon(PokemonGymOwner gymOwner) {
        return null;
    }

    @Override
    public Pokemon choosePokemon(PokemonTrainer trainer) {
        return null;
    }

    @Override
    public int randomAttackByGymOwner() {
        return 0;
    }

    @Override
    public void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack) {

    }

    @Override
    public void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon) {

    }

    @Override
    public void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym) {

    }
}



