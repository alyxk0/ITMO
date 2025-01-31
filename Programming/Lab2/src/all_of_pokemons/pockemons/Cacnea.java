package all_of_pokemons.pockemons;

import all_of_pokemons.moves.*;
import ru.ifmo.se.pokemon.*;

public class Cacnea extends Pokemon {
    public Cacnea(String name, int level){
        super(name,level);
        setStats(50,85,40,85,40,35);
        setType(Type.GRASS);
        setMove(new Facade(), new EnergyBall(), new Leer());
    }
}