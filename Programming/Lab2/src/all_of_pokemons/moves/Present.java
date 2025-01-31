package all_of_pokemons.moves;

import ru.ifmo.se.pokemon.*;

public class Present extends PhysicalMove {
    boolean flag;

    public Present() {
        super(Type.NORMAL, 0, 90);
        if (Math.random() <= 0.5) {
            flag = true;
        }
    }

    public void applyOppEffects(Pokemon poc) {
        if (flag == false)
            poc.setMod(Stat.HP, -10);
    }

    protected String describe() {
        if (flag) return "снимает хп сопернику";
        else return "хилит хп сопернику";
    }
}
