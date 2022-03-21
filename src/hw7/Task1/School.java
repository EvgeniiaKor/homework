package hw7.Task1;

public class School {
    /*харатеристики:
1. название - задается при создании объекта и не может быть изменено в последствии
2. директор - школа не может функционировать без директора
3. учителя[] - массив
4. ученики[] - массив

метод:
1. день в школе():
     1) директор объявляет начало занятий
     2) учителя учат учеников (предмет учителя и ученика должны совпадать,
     уровень знаний ученика в процессе обучения должен увеличиваться)
     3) директор объявляет окончание занятий*/

    private String name;

    public String getName() {
        return name;
    }

    private Director director;
    private Teacher[] teachers = new Teacher[3];
    private Student[] students = new Student[10];

    public School(String name, Director director) {
        this.name = name;
        this.director = director;
    }

    public void day() {
        director.nachalo();
        for (Teacher t : teachers) {
            for (Student s : students) {

                if ((s != null && t != null) && (t.getPredmet().equals(s.getPredmet()))) {
                    t.uchit(s);
                }
            }
        }
        director.konec();
    }

    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    public void addStudents(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

}
