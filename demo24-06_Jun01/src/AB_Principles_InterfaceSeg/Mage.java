package AB_Principles_InterfaceSeg;

import java.util.List;

public class Mage implements LevellingMage{

    @Override
    public Object score() {
        return null;
    }

    @Override
    public List<Object> getPoints() {
        return null;
    }

    @Override
    public List<Object> learnSpell() {
        System.out.println("New spell learnt.");
        return null;
    }
}
