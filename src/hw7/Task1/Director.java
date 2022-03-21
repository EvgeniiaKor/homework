package hw7.Task1;

public class Director extends Base {

    public Director(String name){super(name);}
    public Director(int age){ super(age);}

    public  void nachalo(){
        System.out.println("занятия начались");
    }

    public  void konec(){
        System.out.println("занятия закончились");
    }
}
