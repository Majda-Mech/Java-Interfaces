import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{

        String name;

        List<Pokemon> pokemons;


    Pokemon raichu = new ElectricPokemon("Raichu", 2, 80, "thunders", "BOOOM");

    Pokemon venusaur = new GrassPokemon("Venusaur", 8, 88, "seeds", "grumble");

    Pokemon ditto = new GrassPokemon("ditto", 6, 7, "leafs","mumble");

    Pokemon charizard = new FirePokemon("Charizard", 5, 50, "lava", "rommeldebommel");

    Pokemon blastoise = new WaterPokemon("Blastoise", 3, 75, "hurricanes", "whoosh");

    Pokemon gyarados = new WaterPokemon("Gyarados", 5, 60, "cyclons", "what");

    // constructor(s) ----------------------------------------------------------------------------------

    public PokemonGymOwner(String name) {
        this.name = name;
    }
    // gettersNsetters -----------------------------------------------------------------------------


        public Pokemon getDitto() {
            return ditto;
        }

        public List<Pokemon> getPokemons() {
            return pokemons;
        }

        public void setPokemons(List<Pokemon> pokemons) {
            this.pokemons = pokemons;
        }

        public Pokemon getRaichu() {
            return raichu;
        }

        public Pokemon getVenusaur() {
            return venusaur;
        }

        public Pokemon getCharizard() {
            return charizard;
        }

        public Pokemon getBlastoise() {
            return blastoise;
        }

        public Pokemon getGyarados() {
            return gyarados;
        }

    public String getName() {
        return name;
    }
    }





