package model.persons;

import java.util.ArrayList;
import java.util.Random;

import model.items.HoneyPot;
import records.ActionRecord;
import enums.SpeechType;

public class Character extends AbstractCharacter {
    private String behavior;
    private SpeechType speech;
    private ArrayList<ActionRecord> actions;
    private HoneyPot honeyPot;
    private boolean isFree = false;

    public Character(String name, String state, String behavior, HoneyPot honeyPot) {
        super(name, state);
        this.behavior = behavior;
        this.actions = new ArrayList<>();
        this.speech = getRandomSpeech();
        this.honeyPot = honeyPot;
        this.honeyPot.setCharacter(this);
    }

    private SpeechType getRandomSpeech() {
        Random rand = new Random();
        SpeechType[] values = SpeechType.values();
        return values[rand.nextInt(values.length)];
    }

    public void shakeHead() {
        if (isFree) return;
        String result = name + " трясет головой.";
        System.out.println(result);
        actions.add(new ActionRecord("shakeHead", result));
    }

    public void shout() {
        if (isFree) return;
        String result = name + " кричит: \"" + speech + "\"";
        System.out.println(result);
        actions.add(new ActionRecord("shout", result));
    }

    public void hit() {
        if (isFree) return;
        String result = name + " пытается стукнуть горшком обо что-нибудь.";
        System.out.println(result);
        actions.add(new ActionRecord("hit", result));
        if (honeyPot.tryToUnstick()) {
            result = name + " разбил горшок!";
            System.out.println(result);
            actions.add(new ActionRecord("hit", result));
            isFree = true;
        }
    }

    public void tryToEscape() {
        if (isFree) return;
        String result = name + " пытается выбраться из горшка.";
        System.out.println(result);
        actions.add(new ActionRecord("tryToEscape", result));
        if (honeyPot.tryToUnstick()) {
            result = name + " выскользнул из горшка!";
            System.out.println(result);
            actions.add(new ActionRecord("tryToEscape", result));
            isFree = true;
        }
    }

    @Override
    public void act() {
        if (isFree) return;
        String result = name + " " + behavior + ".";
        System.out.println(result);
        actions.add(new ActionRecord("act", result));
    }

    public ArrayList<ActionRecord> getActions() {
        return actions;
    }

    public void randomAction() {
        if (isFree) return;
        Random rand = new Random();
        int action = rand.nextInt(4);
        switch (action) {
            case 0:
                shakeHead();
                break;
            case 1:
                shout();
                break;
            case 2:
                hit();
                break;
            case 3:
                tryToEscape();
                break;
        }
        // Обновляем случайную реплику после каждого действия
        this.speech = getRandomSpeech();
    }

    public boolean isFree() {
        return isFree;
    }
}
