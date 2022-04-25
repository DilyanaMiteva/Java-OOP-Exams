package aquarium.entities.aquariums;

public class SaltwaterAquarium extends BaseAquarium {
    public SaltwaterAquarium(String name) {
        super(name, 25);
    }

    @Override
    public String getInfo() {
        return String.format("%s (%s):", super.getName(), "SaltwaterAquarium") +
                System.lineSeparator() +
                super.getInfo();
    }

}
