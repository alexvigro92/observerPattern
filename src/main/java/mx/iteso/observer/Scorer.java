package mx.iteso.observer;

/**
 * Created by mavg_ on 9/24/2015.
 */
public class Scorer {

    public String Name;
    public String Number;
    public String Position;
    public String Team;

    public Scorer(String name,String number,String position,String team){
        Team = team;
        Position = position;
        Number = number;
        Name = name;

    }

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public String getPosition() {
        return Position;
    }

    public String getTeam() {
        return Team;
    }
}
