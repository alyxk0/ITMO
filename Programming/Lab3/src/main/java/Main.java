import exception.StuckException;
import model.items.HoneyPot;
import model.persons.Character;
import model.persons.WinnieThePooh;
import records.ActionRecord;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();

        HoneyPot honeyPot = new HoneyPot("лес");
        WinnieThePooh pooh = new WinnieThePooh("застрял", "трясет головой", honeyPot);
        characters.add(pooh);

        try {
            honeyPot.stick();
        } catch (StuckException e) {
            System.out.println(e.getMessage());
        }

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            if (pooh.isFree()) {
                break; // Прекращаем выполнение цикла, если Винни-Пух выбрался
            }
            pooh.randomAction();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Character character : characters) {
            character.performAct();
            for (ActionRecord action : character.getActions()) {
                System.out.println("Действие: " + action.action() + ", Результат: " + action.result());
            }
        }

        if (honeyPot.isStuck()) {
            System.out.println(pooh.getName() + " все еще застрял в горшке с медом.");
        } else {
            System.out.println(pooh.getName() + " смог выбраться из горшка с медом.");
        }
    }
}
