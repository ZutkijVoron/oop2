package market;

interface ActorBehavior {
	void setMarketOrder(boolean isMarketOrder);

	void setTakeOrder(boolean isTakeOrder);

	boolean isMarketOrder();

	boolean isTakeOrder();
}
