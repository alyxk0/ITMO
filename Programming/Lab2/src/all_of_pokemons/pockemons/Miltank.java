package all_of_pokemons.pockemons;

import all_of_pokemons.moves.*;
import ru.ifmo.se.pokemon.*;

public class Miltank extends Pokemon {
    public Miltank(String name, int level){
        super(name,level);
        setStats(95,80,105,40,70,100);
        setType(Type.NORMAL);
        setMove(new DoubleTeam(), new MilkDrink(), new Present(), new WakeUpSlap());
    }
}