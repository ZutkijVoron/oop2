package market;

/**
 * QueBehavior
 */
public interface QueBehavior {
	void takeInQueue(Actor actor);

	void takeOrders();

	void giveOrders();

	void releaseFromQueue();
}
