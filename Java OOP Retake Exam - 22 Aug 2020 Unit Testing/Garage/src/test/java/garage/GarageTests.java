package garage;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GarageTests {
    @Test
    public void test1(){
        Garage garage = new Garage();
        Car car = new Car("opel", 100, 2500.0);
        garage.addCar(car);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        Garage garage = new Garage();
        Car car = new Car("opel", 100, 2500.0);
        garage.addCar(null);
    }
    @Test
    public void test3(){
        Garage garage = new Garage();
        Car car = new Car("opel", 100, 2500.0);
        Car car2 = new Car("lada", 100, 3500.0);
        garage.addCar(car);
        garage.addCar(car2);
        Assert.assertEquals(garage.getTheMostExpensiveCar(), car2);
    }
    @Test
    public void test11(){
        Garage garage = new Garage();
        Car car = new Car("opel", 100, 2500.0);
        Car car2 = new Car("lada", 100, 3500.0);
        garage.addCar(car);
        garage.addCar(car2);
        List<Car> list = garage.findAllCarsWithMaxSpeedAbove(10);
        Assert.assertEquals(2, list.size());
    }
    @Test
    public void test12(){
        Garage garage = new Garage();
        Car car = new Car("opel", 100, 2500.0);
        Car car2 = new Car("lada", 100, 3500.0);
        garage.addCar(car);
        garage.addCar(car2);
        List<Car> opel = garage.findAllCarsByBrand("opel");
        Assert.assertEquals(1, opel.size());

    }
    @Test
    public void test4(){
        Garage garage = new Garage();
        Car car = new Car("opel", 100, 2500.0);
        List<Car> cars = garage.getCars();
        Assert.assertEquals(cars.size(), garage.getCars().size());
        Assert.assertArrayEquals(cars.toArray(), garage.getCars().toArray());
    }

    @Test
    public void test5(){
        Garage garage = new Garage();
        Car car = new Car("opel", 100, 2500.0);
        garage.addCar(car);
        int count = garage.getCount();
        Assert.assertEquals(1, count);
    }


}