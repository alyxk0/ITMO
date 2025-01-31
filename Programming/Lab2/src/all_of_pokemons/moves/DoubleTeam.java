package all_of_pokemons.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon att){
        double doubleValue = 6.0 * Math.random();
        int intValue = (int) doubleValue;

        att.setMod(Stat.EVASION, intValue);
    }
}
