package market;

import java.util.List;

interface MarketBehavior {
	void acceptToMarket(Actor actor);

	void releaseFromMarket(List<Actor> actors);

	void update();
}
