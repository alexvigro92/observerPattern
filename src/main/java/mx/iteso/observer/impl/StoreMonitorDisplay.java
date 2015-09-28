package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.Subject;

import java.util.List;

public class StoreMonitorDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private List<Scorer> scorers;
    private Subject scoresData;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("\nStoreMonitorDisplay " + "\nLatest score is: "+ homeTeam + " (HOME)" + homeGoals + " - " + awayTeam + " (AWAY)" + awayGoals + "\nScorers were:");
        for(Scorer scorer : scorers){
            System.out.print("Name: " + scorer.getName() + " Number: " + scorer.getNumber() + " Position: " + scorer.getPosition() + " Team: " + scorer.getTeam()+"\n");
        }
    }

    public void update(String home, String away, int homeGoals, int awayGoals,List<Scorer> scorer) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers = scorer;
        display();
    }

}
