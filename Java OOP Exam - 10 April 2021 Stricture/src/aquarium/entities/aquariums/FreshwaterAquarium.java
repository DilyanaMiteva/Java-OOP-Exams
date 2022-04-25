package aquarium.entities.aquariums;

public class FreshwaterAquarium extends BaseAquarium {
    public FreshwaterAquarium(String name) {
        super(name, 50);
    }

    @Override
    public String getInfo() {
        return String.format("%s (%s):", super.getName(), "FreshwaterAquarium") +
                System.lineSeparator() +
                super.getInfo();
    }
}
