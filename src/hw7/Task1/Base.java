package hw7.Task1;

abstract public class Base {

    /* имя(String)
       возраст(int)
       ?? название предмета(изучаемого/преподаваемого)
     */

    public String name;
    public int age;
    //public  String predmet; не сюда

    public Base(String name){
        setName(name);
    }

    public Base(int age){
        setAge(age);
    }
    public Base(String name,int age){
        setName(name);
        setAge(age);
    }




    public String getName(){ return  name;}
    public int getAge(){ return age;}

    // void?
    public void setName(String nameValue){
        if (nameValue == null) {
            throw new IllegalArgumentException("Имя должно содержать символы");
        }
        name = nameValue;
    }

    public void setAge(int ageValue) {
        if (ageValue == 0) {
            throw new IllegalArgumentException("возраст должен быть больше 0");
        }
        age = ageValue;
    }
}
