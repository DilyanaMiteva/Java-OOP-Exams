package aquarium.entities.fish;

public class SaltwaterFish extends BaseFish {

    private int size;

    public SaltwaterFish(String name, String species, double price) {
        super(name, species, price);
        super.setSize(5);
    }

    @Override
    public void eat() {
        int size = super.getSize();
        size += 2;
        super.setSize(size);
    }
}
