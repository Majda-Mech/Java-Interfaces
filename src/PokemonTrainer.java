import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    String name;

    List<Pokemon> pokemons;


    Pokemon raichu = new ElectricPokemon("Raichu", 2, 80, "thunders", "BOOOM") {
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
    };

    Pokemon venusaur = new GrassPokemon("Venusaur", 8, 88, "seeds", "grumble");

    Pokemon ditto = new GrassPokemon( "ditto", 6, 7, "leafs","mumble");

    Pokemon charizard = new FirePokemon("Charizard", 5, 50, "lava", "rommeldebommel");

    Pokemon blastoise = new WaterPokemon("Blastoise", 3, 75, "hurricanes", "whoosh");

    Pokemon gyarados = new WaterPokemon("Gyarados", 5, 60, "cyclons", "what");


    // constructor(s) ----------------------------------------------------------------------------------

    public PokemonTrainer(String name) {
        this.name = name;
    }
    public PokemonTrainer() {
    }

    // gettersNsetters -----------------------------------------------------------------------------

    public String getName() {
        return name;
    }
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public Pokemon getCharizard() {
        return charizard;
    }
    public Pokemon getDitto() {
        return ditto;
    }
    public Pokemon getRaichu() {
        return raichu;
    }
    public Pokemon getVenusaur() {
        return venusaur;
    }
    public Pokemon getBlastoise() {
        return blastoise;
    }
    public Pokemon getGyarados() {
        return gyarados;
    }
}




