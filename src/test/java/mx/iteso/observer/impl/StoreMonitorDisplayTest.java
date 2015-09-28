package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        List<Scorer> scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("pit", "defense", "23", "testTeam"));
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0,scorers);
        //Nothing to assert or verify for now
    }

}
