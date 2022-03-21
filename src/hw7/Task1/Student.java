package hw7.Task1;

public class Student extends Base2{

    /*характеристики:
1. имя (тип String)
2. возраст (тип int)
3. название изучаемого предмета (тип String)
4. уровень знаний (тип int)

метод:
1. учиться(навык_учителя) -
уровень знаний ученика повышается на рандомное значение в диапазоне [0, навык_учителя]*/

    /*private String name;
    private int age;*/
    private int knowleges ;
    public Student(String name, String predmet){super(predmet,name);}

    public void uchitsya (int navik){
        knowleges +=(int) (Math.random()*navik);
        System.out.println("ученик обучилсяб его уровень знаний равен " + knowleges);
    }
    public int getKnowleges(){return knowleges;}


}
