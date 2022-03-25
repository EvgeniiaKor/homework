package hw6.task2;

public class MyProduct {
    //Класс МоиПродукты:
    //Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
    //Реализовать метод, который принимает на Продукт и добавляет его в список, если характеристики
    // продукта полностью соответствуют заявленным разрешениям, в противном случае сообщить, по какой
    // причине продукт не может быть добавлен в список (например, слишком большое содержание калорий)
    //Реализовать метод, который выводит названия всех продуктов из списка


    private Double maxProtein = 10.0;
    private Double maxFat = 5.0;
    private Double maxCarbs = 20.0;
    private Double maxCalories = 100.0;
    private Product[] spisok = new Product[5];


    public void addProduct(Product product) {
        for (int i = 0; i < spisok.length; i++) {
            if (product.getProtein() > maxProtein) {
                throw new IllegalArgumentException("Белки меньше 10");
            }
            if (product.getFat() > maxFat) {
                throw new IllegalArgumentException("Жиры меньше 5");
            }
            if (product.getCarbs() > maxCarbs) {
                throw new IllegalArgumentException("Углеводы меньше 20");
            }
            if (product.getCalories() > maxCalories) {
                throw new IllegalArgumentException("Калории меньше 100");
            }
            if (spisok[i] == null) {
                spisok[i] = product;
                break;
            }
        }
    }

    public void addProduct(Product... spisok) {
        for (Product product : spisok) {
            addProduct(product);
        }
    }

    public void printMyProducts() {
        for (Product product : spisok) {
            if (product != null) {
                System.out.println("Название: " + product.getName());
                System.out.println("белки: " + product.getProtein());
                System.out.println("жиры: " + product.getFat());
                System.out.println("углеводы: " + product.getCarbs());
                System.out.println("калории: " + product.getCalories());
                System.out.println("--------");

            }
        }
    }
}
