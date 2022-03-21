package hw7.Task1;

public class Director extends Base {
    /*харатеристиками:
1. имя (тип String)
2. возраст (тип int)

методами:
1. объявить начало занятий() - вывод информации в косоль
2. объявить окончание занятий занятий() - вывод информации в косоль*/

    public Director(String name){super(name);}
    public Director(int age){ super(age);}

    public  void nachalo(){
        System.out.println("занятия начались");
    }

    public  void konec(){
        System.out.println("занятия закончились");
    }
}
