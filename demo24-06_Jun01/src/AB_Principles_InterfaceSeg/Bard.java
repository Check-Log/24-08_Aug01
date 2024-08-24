package AB_Principles_InterfaceSeg;

import java.util.List;

public class Bard implements LevellingBard {

    @Override
    public Object score() {
        return null;
    }

    @Override
    public List<Object> getPoints() {
        return null;
    }

    @Override
    public List<Object> learnSong() {
        System.out.println("New song learned");
        return null;
    }
}
