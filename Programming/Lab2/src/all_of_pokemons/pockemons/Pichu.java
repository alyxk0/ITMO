package all_of_pokemons.pockemons;

import all_of_pokemons.moves.*;
import ru.ifmo.se.pokemon.*;

public class Pichu extends Pokemon {
    public Pichu(String name, int level){
        super(name,level);
        setStats(20,40,15,35,35,60);
        setType(Type.ELECTRIC);
        setMove(new DoubleTeam(), new ThunderWave());
    }
}
