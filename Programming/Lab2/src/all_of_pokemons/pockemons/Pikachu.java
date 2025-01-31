package all_of_pokemons.pockemons;

import all_of_pokemons.moves.*;
import ru.ifmo.se.pokemon.*;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level){
        super(name,level);
        setStats(35,55,40,50,50,90);
        setType(Type.ELECTRIC);
        setMove(new DoubleTeam(), new ThunderWave(), new Discharge());
    }
}