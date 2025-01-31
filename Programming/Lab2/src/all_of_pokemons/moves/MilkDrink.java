package all_of_pokemons.moves;

import ru.ifmo.se.pokemon.*;

public class MilkDrink extends StatusMove{
    public MilkDrink(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon att){
        double doubleValue = att.getHP()*-0.5;
        int intValue = (int) doubleValue;
        att.setMod(Stat.HP, intValue);
    }
}