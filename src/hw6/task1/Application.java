package hw6.task1;

public class Application {
    public static void main(String[] args) {

            // альпинисты
            Alphinist[] alpinists1 = new Alphinist[3];
            alpinists1[0] = new Alphinist("Maxim");
            alpinists1[1] = new Alphinist("Ivan");
            alpinists1[2] = new Alphinist("Olga");

            Alphinist [] alpinists2 = new Alphinist[3];
            alpinists2[0] = new Alphinist("Yana");
            alpinists2[1] = new Alphinist("Oleg");

            Alphinist [] alpinists3 = new Alphinist[3];
            alpinists3[0] = new Alphinist("Alexandr");
            alpinists3[1] = new Alphinist("Georgii");

            // горы
            Mountain mountain1 = new Mountain("Everest", "China", 8848);
            Mountain mountain2 = new Mountain("Elbrus","Russia",5642);
            Mountain mountain3 = new Mountain("Ararat", "Turkey", 5137);

            // группы
            Groups groupName1 = new Groups(false, alpinists1);
            groupName1.getGroupName("One");
            groupName1.setGoMountain(mountain1);

            Groups groupName2 = new Groups(true, alpinists2);
            groupName2.getGroupName("Two");
            groupName2.setGoMountain(mountain2);

            Groups groupName3 = new Groups(true, alpinists3);
            groupName3.getGroupName("Three");
            groupName3.setGoMountain(mountain3);
    }
}
