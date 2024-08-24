package AB_Principles_InterfaceSeg;

import java.util.List;

public class Rogue implements Leveling {

    @Override
    public Object score() {
        return null;
    }

    @Override
    public Object crimeScore() {
        System.out.println("Current crime score: 6");
        return null;
    }

    @Override
    public List<Object> getPoints() {
        return null;
    }

    @Override
    public void initiatePoints() {

    }

    @Override
    public void initiateMoralPoints() {
        throw new UnsupportedOperationException("This is not Paladin levelling");
    }

    @Override
    public void initiateMoralPointsReduction() {
        throw new UnsupportedOperationException("This is not Paladin levelling");

    }
}
