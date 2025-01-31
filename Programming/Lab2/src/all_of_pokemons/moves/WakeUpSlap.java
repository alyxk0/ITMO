package all_of_pokemons.moves;
import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap(){
        super(Type.FIGHTING, 70, 100);
    }
    private boolean flag;
    @Override
    public void applyOppDamage(Pokemon poc, double damage){
        Status cond = poc.getCondition();
        flag = true;
        if (cond.equals(Status.SLEEP)) {
            poc.setMod(Stat.HP, -2*(int)Math.round(damage));
        }
        Effect eff = new Effect();
        poc.addEffect(eff);
    }
    @Override
    protected String describe(){
        if(flag) return "бьёт по спящему";
        else return "бьёт";
    }
}