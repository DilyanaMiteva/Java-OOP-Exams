package store;

import org.junit.Assert;
import org.junit.Test;

public class StoreTests {
    @Test
    public void test1() {
        Store store = new Store();
        Product product = new Product("name", 5, 1.5);
        Product product1 = new Product("name1", 25, 3.5);
        store.addProduct(product);
        store.addProduct(product1);
        Assert.assertEquals(2, store.getProducts().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        Store store = new Store();
        store.addProduct(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        Store store = new Store();
        Product product = new Product("name", -5, 1.5);
        store.addProduct(product);
    }

    @Test
    public void test5() {
        Store store = new Store();
        Product product = new Product("name", 5, 1.5);
        store.addProduct(product);
        Assert.assertEquals(1, store.getCount());
        Assert.assertEquals(1, store.getProducts().size());
    }


    @Test
    public void test7() {
        Store store = new Store();

        Product product = new Product("name", 5, 8.5);
        Product product1 = new Product("name1", 2, 12.5);

        store.addProduct(product);
        store.addProduct(product1);
        Assert.assertEquals(product1, store.getTheMostExpensiveProduct());
    }


    @Test(expected = IllegalArgumentException.class)
    public void test8() {
        Store store = new Store();

        Product product = new Product("name", 5, 8.5);
        Product product1 = new Product("name1", 2, 12.5);

        store.addProduct(product);
        store.addProduct(product1);

        store.buyProduct("null", 5);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test9() {
        Store store = new Store();

        Product product = new Product("name", 3, 8.5);
        Product product1 = new Product("name1", 2, 12.5);

        store.addProduct(product);
        store.addProduct(product1);

        store.buyProduct("name", 5);

    }


    @Test
    public void test10() {
        Store store = new Store();

        Product product = new Product("name", 3, 8.5);
        Product product1 = new Product("name1", 2, 10.0);

        store.addProduct(product);
        store.addProduct(product1);

        double finalPrice = store.buyProduct("name1", 1);


        Assert.assertEquals(10.0, store.buyProduct("name1", 1), 0.0);
    }


}