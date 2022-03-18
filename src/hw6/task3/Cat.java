package hw6.task3;

public class Cat {
    // имя
    // скорость
    // вес
    // пойманные мыши

    private String name;
    private Double speedCat;
    private Double weight;
    private int catched;

    // сеттер для speedCat
    public  void setSpeedCat(Double speedCatValue){
        if (speedCatValue <= 0){
            throw IllegalArgumentException("скорость кота больше 0");
        }
        speedCat = speedCatValue;
    }

    // геттер для speedCat
    public  Double getSpeedCat(){return speedCat};

    // сеттер для name
    public  void setName(String nameValue){
        if (nameValue == null){
            throw IllegalArgumentException(" имя кота содержит символы");
        }
        name = nameValue;
    }

    // геттер для name
    public  String getName(){return name};

    // сеттер для weight
    public void Double(Double weightValue) {
        if (weightValue <= 0) {
            throw IllegalArgumentException("кот весит больше 0 кг");
        }
        weight = weightValue;
    }

    // геттер для weight
    public Double getWeight(){return  weight};

    // сеттер для catched
    public void setCatched(int catchedValue){
        if (catchedValue < 0 || catchedValue > 100 ) {
            throw IllegalArgumentException("кол-во пойманных мышей не может быть отрицательным или больше 100");
        }
        catched = catchedValue;
        }

        // геттер для catched
    public  int getCatched(){return  catched};
    }

}