package blueOrigin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SpaceshipTests {

    private Spaceship spaceship;

    @Before
    public void setUp(){
        this.spaceship = new Spaceship("test_name", 5);
    }


    @Test(expected = NullPointerException.class)
    public void test1() {
        new Spaceship(null, 5);
    }

    @Test(expected = NullPointerException.class)
    public void test2() {
        new Spaceship("   ", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        new Spaceship("asd", -1);
    }




    @Test()
    public void test4() {
        spaceship.add(new Astronaut("asd", 100));

    }
    @Test(expected = IllegalArgumentException.class)
    public void test5() {

        Astronaut astronaut = new Astronaut("asd", 100);
        Astronaut astronaut1 = new Astronaut("asd", 100);
        spaceship.add(astronaut);
        spaceship.add(astronaut);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test6(){
        Spaceship spaceship = new Spaceship("test_name", 1);

        spaceship.add(new Astronaut("asd", 100));
        spaceship.add(new Astronaut("qwe", 100));

    }
    

    @Test()
    public void test8() {
        Spaceship spaceship = new Spaceship("test_name", 2);

        spaceship.add(new Astronaut("asd", 100));
        spaceship.add(new Astronaut("qwe", 100));

        Assert.assertEquals(2, spaceship.getCount());
    }

    @Test()
    public void test9() {

        spaceship.add(new Astronaut("asd", 100));

        Assert.assertEquals("test_name", spaceship.getName());
    }

    @Test()
    public void test10() {

        spaceship.add(new Astronaut("asd", 100));
        spaceship.add(new Astronaut("asm", 100));

        spaceship.remove("asd");

        Assert.assertEquals(1, spaceship.getCount());
    }


}
