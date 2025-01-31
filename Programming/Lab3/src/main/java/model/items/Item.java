package model.items;

public class Item extends AbstractItem {
    private String name;
    private String state;
    private String location;

    public Item(String name, String state, String location) {
        this.name = name;
        this.state = state;
        this.location = location;
    }

    @Override
    public void use() {
        System.out.println("Использование предмета: " + name);
    }
}
