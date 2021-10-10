package udemyBlackBeltJava.generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teams <T extends Participant> {
    private String name;
    private List<T>participants=new ArrayList<>();

    public Teams(String name) {
        this.name = name;
    }
    public void addNewParticipant (T participant){
        participants.add(participant);
        System.out.println("V komandu "+ name+" bil dobavlen nnoviy uchastnik "+ " po imeni "+ participant.getName());
    }
    public void playwith (Teams <T> team){
        String winnerName;
        Random random= new Random();
        int i = random.nextInt(2);
        if (i==0){
            winnerName=this.name;
        } else {
            winnerName=team.name;
        }
        System.out.println("Viigrala komande " + winnerName);
    }
}
