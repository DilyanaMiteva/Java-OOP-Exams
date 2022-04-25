package aquarium.entities.fish;

public class FreshwaterFish extends BaseFish {

    private int size;

    public FreshwaterFish(String name, String species, double price) {
        super(name, species, price);
        super.setSize(3);
    }

    @Override
    public void eat() {
        int size = super.getSize();
        size += 3;
        super.setSize(size);
    }
}
