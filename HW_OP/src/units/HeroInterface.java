package HW_OP.src.units;

import java.util.ArrayList;

public interface HeroInterface {
    void step(ArrayList<BaseHero> heroList);
    String getInfo();
}