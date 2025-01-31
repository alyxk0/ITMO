package all_of_pokemons.moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove{

    public ThunderWave(){
        super(Type.ELECTRIC,0,90);

    }
    @Override
    public void applyOppEffects(Pokemon poc) {
        Effect.paralyze(poc);
    }
    @Override
    protected String describe(){
        return "парализует";
    }
}