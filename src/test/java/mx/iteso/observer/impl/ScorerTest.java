package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/27/2015.
 */
public class ScorerTest {
    Scorer scorer;

    @Before
    public void scorerTest(){
         scorer = new Scorer("miguel","12","defensa","intel");
    }

    @Test
    public void getNameTest(){
        assertEquals("miguel",scorer.getName());
    }
    @Test
    public void getNumberTest(){
        assertEquals("12",scorer.getNumber());
    }
    @Test
    public void getPositionTest(){
        assertEquals("defensa",scorer.getPosition());
    }
    @Test
    public void getTeamTest(){
        assertEquals("intel",scorer.getTeam());
    }
}
