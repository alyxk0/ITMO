package all_of_pokemons;

import all_of_pokemons.pockemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Cacnea p1 = new Cacnea("Дебил", 1);
        Cacturne p2 = new Cacturne("Дебилище", 1);;
        Pichu p3 = new Pichu("Пикачу младший", 1);
        Pikachu p4 = new Pikachu("Пикачу средний", 5);
        Raichu p5 = new Raichu("Пикачу старший", 5);
        Miltank p6 = new Miltank("Толстый", 5);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}