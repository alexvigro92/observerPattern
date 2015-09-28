package mx.iteso.observer;

import mx.iteso.observer.impl.MovileAppDisplay;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

import java.util.ArrayList;
import java.util.List;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        MovileAppDisplay movileAppDisplay = new MovileAppDisplay(scoresData);

        List<Scorer> scorersTacitKnowledgeVSIntel = new ArrayList<Scorer>();

        scorersTacitKnowledgeVSIntel.add(new Scorer("ray", "7", "defensa", "Intel"));
        scorersTacitKnowledgeVSIntel.add(new Scorer("miguel", "8", "portero", "TacitKnowledge"));
        scorersTacitKnowledgeVSIntel.add(new Scorer("ubaldo", "12", "defensa", "TacitKnowledge"));
        scorersTacitKnowledgeVSIntel.add(new Scorer("alejandro", "34", "delantero", "TacitKnowledge"));

        scoresData.setScore("Tacit Knowledge", "Intel", 3, 1, scorersTacitKnowledgeVSIntel);

    }
}
