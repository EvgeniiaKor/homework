package hw7.Task1;

public class Student extends Base2{

    private int knowleges ;
    public Student(String name, String predmet){super(predmet,name);}

    public void uchitsya (int navik){
        knowleges +=(int) (Math.random()*navik);
        System.out.println("ученик обучилсяб его уровень знаний равен " + knowleges);
    }
    public int getKnowleges(){return knowleges;}
}
