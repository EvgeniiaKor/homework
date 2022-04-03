package course1;

public class Application {
    public static void main(String[] args) {

        Client client1 = new Client("Ivan Ivanov", "28.11.1994");
        Client client2 = new Client("Anna Ilina", "01.01.1982");
        Client client3 = new Client("Olga Maximova", "05.08.1971");
        Client client4 = new Client("Andrey Popov", "11.03.2002");
        Client client5 = new Client("Oleg Markov", "29.04.1999");


        Card card1 = new Card(Abonement.FULL, client1);
        Card card2 = new Card(Abonement.ONE, client2);
        Card card3 = new Card(Abonement.DAY, client3);
        Card card4 = new Card(Abonement.FULL, client4);
        Card card5 = new Card(Abonement.DAY, client5);


        Fitness day = new Fitness();

        day.visit("swim", card1);
        day.visit("swim", card2);
        day.visit("gym", card3);
        day.visit("swim", card4);
        day.visit("group", card5);


        day.printInfo();
        System.out.println();
        day.close();

    }
}