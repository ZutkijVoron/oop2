package market;

import java.util.ArrayList;
import java.util.List;

/**
 * Market
 */
class Market implements MarketBehavior, QueBehavior {
	private List<Actor> queue = new ArrayList<>();

	@Override
	public void acceptToMarket(Actor actor) {
		System.out.println(actor.getName() + " в магазине");
		takeInQueue(actor);
	}

	@Override
	public void releaseFromMarket(List<Actor> actors) {
		queue.removeAll(actors);
	}

	@Override
	public void update() {
		takeOrders();
		giveOrders();
		releaseFromQueue();
	}

	@Override
	public void takeInQueue(Actor actor) {
		System.out.println(actor.getName() + " в очереди");
		queue.add(actor);
	}

	@Override
	public void takeOrders() {
		for (Actor actor : queue) {
			if (!actor.isMarketOrder) {
				System.out.println(actor.getName() + " принял заказ");
				actor.setMarketOrder(true);
			}
		}
	}

	@Override
	public void giveOrders() {
		for (Actor actor : queue) {
			if (actor.isMarketOrder) {
				actor.setTakeOrder(false);
				System.out.println(actor.getName() + " получил заказ");
			}
		}
	}

	@Override
	public void releaseFromQueue() {
		List<Actor> actors = new ArrayList<>();
		for (Actor actor : queue) {
			if (actor.isMarketOrder) {
				System.out.println(actor.getName() + " уходит");
				actors.add(actor);
			}
		}
		releaseFromMarket(actors);
	}
}
