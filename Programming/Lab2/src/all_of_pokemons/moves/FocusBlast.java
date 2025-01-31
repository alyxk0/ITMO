package all_of_pokemons.moves;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);

        if (Math.random() <= 0.1) {
            flag = true;
        }
    }

    private boolean flag;

    @Override
    public void applyOppEffects(Pokemon poc) {
        if (flag) {
            double doubleValue = -6.0 * Math.random();
            int intValue = (int) doubleValue;

            poc.setMod(Stat.SPECIAL_DEFENSE, intValue);
        }
    }

    @Override
    protected String describe() {
        if (flag) return "ебнёт и снижает спец защиту";
        else return "ебнёт";
    }
}
