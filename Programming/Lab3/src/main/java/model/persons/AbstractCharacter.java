package model.persons;

public abstract class AbstractCharacter implements Actable {
    protected String name;
    protected String state;

    public AbstractCharacter(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public abstract void act();

    @Override
    public void performAct() {
        act();
    }

    public String getName() {
        return name;
    }
}
