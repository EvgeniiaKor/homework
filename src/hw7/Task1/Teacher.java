package hw7.Task1;

public class Teacher extends Base2{
    public int navik;
    public Teacher(String name, String predmet, int navik){
        super(predmet, name);
        this.navik = navik;}

    public  void uchit(Student student){
        student.uchitsya(navik);
        System.out.println("учитель учит" + getPredmet());
    }
}
