package aquarium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class AquariumTests {

    private Collection<Fish> fish;

    public AquariumTests() {
        this.fish = new ArrayList<>();
    }



    @Test(expected = NullPointerException.class)
    public void test1(){
        Aquarium aquarium = new Aquarium(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void test2(){
        Aquarium aquarium = new Aquarium("        ", 10);
    }

    @Test
    public void test3(){
        Aquarium aquarium = new Aquarium("A", 10);
        assertEquals("A", aquarium.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4(){
        Aquarium aquarium = new Aquarium("A", -10);
    }

    @Test
    public void test31(){
        Aquarium aquarium = new Aquarium("A", 10);
        assertEquals(10, aquarium.getCapacity());
    }

    @Test
    public void test5(){
        Aquarium aquarium = new Aquarium("A", 2);
        aquarium.add(new Fish("D"));
        /*fish.add(new Fish("G"));*/
        assertEquals(aquarium.getCount() + 1, aquarium.getCapacity());

    }
 //(expected = IllegalArgumentException.class)
    @Test(expected = IllegalArgumentException.class)
    public void test6(){
        Aquarium aquarium = new Aquarium("A", 2);
        aquarium.add(new Fish("D"));
        aquarium.add(new Fish("G"));
        aquarium.add(new Fish("M"));


    }

    @Test
    public void test7(){
        Aquarium aquarium = new Aquarium("A", 2);
        aquarium.add(new Fish("D"));
        aquarium.add(new Fish("G"));
        aquarium.remove("D");
        //aquarium.remove("G");
        assertEquals(1, aquarium.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test8(){
        Aquarium aquarium = new Aquarium("A", 2);
        aquarium.add(new Fish("D"));
        aquarium.add(new Fish("G"));
        aquarium.remove("D");
        aquarium.remove("G");
        aquarium.remove("G");

    }

    @Test(expected = IllegalArgumentException.class)
    public void test9(){
        Aquarium aquarium = new Aquarium("A", 2);
        fish.add(new Fish("D"));
        fish.add(new Fish("G"));
        aquarium.sellFish("D");
        assertNull(aquarium.sellFish(null));

    }

    @Test
    public void test10(){
        Aquarium aquarium = new Aquarium("A", 2);
        Fish d = new Fish("D");
        Fish g = new Fish("G");
        aquarium.add(d);
        aquarium.add(g);
        //assertEquals(2, aquarium.getCount());
        aquarium.sellFish("D");
        assertEquals(d, aquarium.sellFish("D"));

    }

}

