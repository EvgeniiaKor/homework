package course1;

import java.util.Arrays;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalTime;


public class Fitness {

    private final Card[] gym = new Card[20];
    private final Card[] swim = new Card[20];
    private final Card[] group = new Card[20];

    public void visit(String zone, Card card){
        if (ChronoUnit.DAYS.between(card.getExit(), LocalDate.now()) >= 0){
            System.out.println("Абонемент просрочен");

        } else if(ChronoUnit.MINUTES.between(card.getAbonement().getEnter(),LocalTime.now()) < 0 || ChronoUnit.MINUTES.between(card.getAbonement().getExit(),LocalTime.now()) > 0){
            System.out.println(card.getClient().getClientName()+", сегодня время посещения у Вашего абонемента закончено ");

        }  else if (zone.equalsIgnoreCase("gym")){
            if (card.getAbonement().isGym()) {
                for (int i = 0; i < gym.length; i++){
                    if(gym[i] == null){
                        gym[i] = card;
                        System.out.println(card.getClient().getClientName() + " время: " + LocalDate.now()+ " " + LocalTime.now());
                        return;
                    }
                } System.out.println("нет мест");
            }
        } else if (zone.equalsIgnoreCase("swim")){
            if(card.getAbonement().isSwim()){
                for (int i = 0; i < swim.length; i++){
                    if (swim[i] == null){
                        swim[i] = card;
                        System.out.println(card.getClient().getClientName() + " время: " + LocalDate.now()+ " " + LocalTime.now());
                        return;
                    }
                }System.out.println("нет мест");
            } else {
                System.out.println(card.getClient().getClientName()+", абонемент без тренажерного зала");
            }
        } else if (zone.equalsIgnoreCase("group")){
            if(card.getAbonement().isGroup()){
                for (int i = 0; i < group.length; i++){
                    if (group[i] == null){
                        group[i] = card;
                        System.out.println(card.getClient().getClientName() + " время: " + LocalDate.now()+ " " + LocalTime.now());
                        return;
                    }
                } System.out.println("мест нет");
            } else {
                System.out.println(card.getClient().getClientName()+", абонемент без групповых занятий");
            }
        }
    }


    public  void printInfo(){
        System.out.println("\n Тренажерный зал: ");
        for (Card card : gym) {
            if (card != null){
                System.out.println(card.getClient().getClientName());
            }
        }
        System.out.println("\n Бассейн: ");
        for (Card card : swim) {
            if (card != null){
                System.out.println(card.getClient().getClientName());
            }
        }
        System.out.println("\n Групповые занятия: ");
        for (Card card : group) {
            if (card != null){
                System.out.println(card.getClient().getClientName());
            }
        }
    }

    public void close(){
        Arrays.fill(gym, null);
        Arrays.fill(swim, null);
        Arrays.fill(group,null);
        System.out.println("Клуб закрыт");
    }
}