package hw7.Task1;

public class Application {

    public static void main(String[] args) {

        Director director = new Director("ivan");
        School school = new School("102", director);

        Teacher teacher1 = new Teacher("Anna","math", 20);
        Teacher teacher2 = new Teacher("Elena","rus", 30);

        Student student1 = new Student("Olga", "math");
        Student student2 = new Student("Andrey", "history");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        school.addStudents(student1);
        school.addStudents(student2);

        school.day();
    }
}
