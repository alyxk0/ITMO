package all_of_pokemons.moves;

import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {
    public Discharge() {
        super(Type.ELECTRIC, 80, 100);

        if (Math.random() <= 0.3) {
            flag = true;
        }
    }

    private boolean flag;

    @Override
    public void applyOppEffects(Pokemon poc) {
        if (flag) {
            if  (poc.hasType(Type.ELECTRIC) == false){
                Effect.paralyze(poc);
            }
        }
    }
    @Override
    protected String describe() {
        if (flag) return "бьёт током и парализует";
        else return "бьёт током";
    }
}
