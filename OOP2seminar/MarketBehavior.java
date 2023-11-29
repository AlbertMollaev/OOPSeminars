package OOP2seminar;

import java.util.List;

public interface MarketBehavior {

    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update();

    
}
