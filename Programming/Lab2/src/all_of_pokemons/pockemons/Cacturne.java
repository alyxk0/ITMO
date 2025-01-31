package all_of_pokemons.pockemons;

import all_of_pokemons.moves.*;
import ru.ifmo.se.pokemon.*;

public class Cacturne extends Pokemon {
    public Cacturne(String name, int level){
        super(name,level);
        setStats(70,115,60,115,60,55);
        setType(Type.GRASS);
        setMove(new Facade(), new EnergyBall(), new Leer(), new FocusBlast());
    }
}
