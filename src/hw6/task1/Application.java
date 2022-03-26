package hw6.task1;

public class Application {
    public static void main(String[] args) {


            Alphinist[] alpinists1 = new Alphinist[3];
            alpinists1[0] = new Alphinist("Maxim", "New York");
            alpinists1[1] = new Alphinist("Ivan", "Tokio");
            alpinists1[2] = new Alphinist("Olga", "Bangladesh");

            Alphinist[] alpinists2 = new Alphinist[3];
            alpinists2[0] = new Alphinist("Yana", "Moscow");
            alpinists2[1] = new Alphinist("Oleg", "Saint-Petersburg");

            Alphinist[] alpinists3 = new Alphinist[3];
            alpinists3[0] = new Alphinist("Alexandr", "Kazan");
            alpinists3[1] = new Alphinist("Georgii", "Munich");


            Mountain mountain1 = new Mountain("Everest", "China", 8848);
            Mountain mountain2 = new Mountain("Elbrus", "Russia", 5642);
            Mountain mountain3 = new Mountain("Ararat", "Turkey", 5137);


            Groups groupName1 = new Groups(false, alpinists1);
            groupName1.setGroupName("№1");
            groupName1.setMountain(mountain1);

            Groups groupName2 = new Groups(true, alpinists2);
            groupName2.setGroupName("№2");
            groupName2.setMountain(mountain2);

            Groups groupName3 = new Groups(true, alpinists3);
            groupName3.setGroupName("№3");
            groupName3.setMountain(mountain3);
    }
}
