package AB_Principles_InterfaceSeg;

import java.util.List;

public class Paladin implements Leveling {

    @Override
    public void initiatePoints() {
        throw new UnsupportedOperationException("This is not a bank payment");
    }

    @Override
    public Object score() {
        return null;
    }

    @Override
    public Object crimeScore() {
        throw new UnsupportedOperationException("This is not Rogue levelling");
    }

    @Override
    public List<Object> getPoints() {
        return null;
    }

    @Override //introduced with bonusLevelling
    public void initiateMoralPoints() {
        System.out.println("Player awarded moral points for good deed.");
    }

    @Override //introduced with bonusLevelling
    public void initiateMoralPointsReduction() {
        System.out.println("Player subtracted moral points for bad deed.");
    }
}
