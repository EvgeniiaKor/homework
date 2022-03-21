package hw7.Task1;

public class Teacher extends Base2{
/*харатеристики:
1. имя (тип String)
2. возраст (тип int)
3. название преподаваемого предмета (тип String)
4. навык учителя (тип int) - максисмум, на который может быть увеличен уровень значний ученика

метод:
1. учить(обучаемый)
 */
    public int navik;
    public Teacher(String name, String predmet, int navik){
        super(predmet, name);
        this.navik = navik;}

    public  void uchit(Student student){
        student.uchitsya(navik);
        System.out.println("учитель учит" + getPredmet());
    }
}
