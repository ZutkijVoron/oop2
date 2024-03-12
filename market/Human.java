package market;

public class Human extends Actor {

	public Human(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setMarketOrder(boolean isMarketOrder) {
		super.isMarketOrder = isMarketOrder;
	}

	@Override
	public void setTakeOrder(boolean isTakeOrder) {
		super.isTakeOrder = isTakeOrder;
	}

	@Override
	public boolean isMarketOrder() {
		return isMarketOrder;
	}

	@Override
	public boolean isTakeOrder() {
		return isTakeOrder;
	}
}
