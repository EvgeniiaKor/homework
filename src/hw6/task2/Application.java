package hw6.task2;

public class Application{
    public static void main(String[] args) {

        Product product1 = new Product("Orange", 0.9, 0.2, 8.1, 43.0);
        Product product2 = new Product("Apple", 0.4, 0.4, 9.8,47.0);
        Product product3 = new Product("Kiwi", 0.8, 0.4, 8.4,47.0);
        Product product4 = new Product("Pineapple", 0.3, 0.1, 11.8,52.0);

        MyProduct a = new MyProduct();
        a.addProduct(product1);
        a.addProduct(product2);
        a.addProduct(product3);
        a.addProduct(product4);
        a.printMyProducts();
    }
}

