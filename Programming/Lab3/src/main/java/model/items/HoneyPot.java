package model.items;

import exception.StuckException;
import model.persons.Character;

import java.util.Random;

public class HoneyPot extends Item {
    private boolean isStuck;
    private model.persons.Character character;

    public HoneyPot(String location) {
        super("Горшок с медом", "прилип", location);
        this.isStuck = true;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void stick() throws StuckException {
        if (isStuck) {
            throw new StuckException("Горшок с медом уже прилип!");
        }
        isStuck = true;
        System.out.println("Горшок с медом прилип к голове " + character.getName() + ".");
    }

    public void unstick() {
        if (character != null) {
            isStuck = false;
            System.out.println("Горшок с медом отлип от головы " + character.getName() + ".");
        }
    }

    public boolean isStuck() {
        return isStuck;
    }

    public boolean tryToUnstick() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            unstick();
            return true;
        }
        return false;
    }
}
