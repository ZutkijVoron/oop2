package market;

abstract class Actor implements ActorBehavior {
	protected String name;
	protected boolean isTakeOrder;
	protected boolean isMarketOrder;

	Actor(String name) {
		this.name = name;
		isMarketOrder = false;
		isTakeOrder = false;
	}

	abstract String getName();
}
