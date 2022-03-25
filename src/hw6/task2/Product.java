package hw6.task2;

public class Product {
    // Класс Продукт:
    // Свойства: название продукта / белки / жиры / углеводы / калории
    // Минимум 4 конструктора
    // Реализовать необходимые проверки входящих данных
    // Создать не менее 4 экземпляров данного класса (объектов)


    private String name;
    private Double protein;
    private Double fat;
    private Double carbs;
    private Double calories;


    // геттеры
    public String getName() {
        return name;
    }

    public Double getProtein() {
        return protein;
    }

    public Double getFat() {
        return fat;
    }

    public Double getCarbs() {
        return carbs;
    }

    public Double getCalories() {
        return calories;
    }

    // сеттеры
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Имя должно содержать символы");
        }
        this.name = name;
    }

    public void setProtein(Double protein) {
        if (protein <= 0) {
            throw new IllegalArgumentException("Протеины должны быть больше 0");
        }
        this.protein = protein;
    }

    public void setFat(Double fat) {
        if (fat <= 0) {
            throw new IllegalArgumentException("Жиры должны быть больше 0");
        }
        this.fat = fat;
    }

    public void setCarbs(Double carbs) {
        if (carbs <= 0) {
            throw new IllegalArgumentException("Углеводы должны быть больше 0");
        }
        this.carbs = carbs;
    }

    public void setCalories(Double calories) {
        if (calories <= 0) {
            throw new IllegalArgumentException("Калории должны быть больше 0");
        }
        this.calories = calories;
    }
/////

    public Product(String name, Double protein, Double fat, Double carbs, Double calories) {
        setName(name);
        setProtein(protein);
        setFat(fat);
        setCarbs(carbs);
        setCalories(calories);
    }

    public Product(Double protein, Double fat, Double carbs, Double calories) {
        setProtein(protein);
        setFat(fat);
        setCarbs(carbs);
        setCalories(calories);
    }
    public Product(String name) {
        setName(name);
    }
}

