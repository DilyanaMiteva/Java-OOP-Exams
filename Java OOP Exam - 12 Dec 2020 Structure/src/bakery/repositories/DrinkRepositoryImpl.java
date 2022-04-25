package bakery.repositories;

import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.drinks.interfaces.Drink;
import bakery.repositories.interfaces.DrinkRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DrinkRepositoryImpl implements DrinkRepository<Drink> {

    private final Collection<Drink> models;

    public DrinkRepositoryImpl() {
        this.models = new ArrayList<>();
    }


    @Override
    public Drink getByNameAndBrand(String drinkName, String drinkBrand) {

        return this.models.stream().filter(e -> e.getName().equals(drinkName)
                && e.getBrand().equals(drinkBrand)).findFirst().orElse(null);
    }

    @Override
    public Collection<Drink> getAll() {

        return Collections.unmodifiableCollection(this.models);
    }

    @Override
    public void add(Drink drink) {

        this.models.add(drink);

    }
}
