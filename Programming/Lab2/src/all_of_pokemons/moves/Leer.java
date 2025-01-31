package all_of_pokemons.moves;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove{

    public Leer(){
        super(Type.NORMAL,0,100);

    }
    @Override
    protected void applyOppEffects(Pokemon poc){
        double doubleValue = 6.0 * Math.random();
        int intValue = (int) doubleValue;

        poc.setMod(Stat.DEFENSE, intValue);
    }
    @Override
    protected String describe(){
        return "снимает защиту";
    }
}
