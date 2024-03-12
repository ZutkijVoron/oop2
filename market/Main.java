package market;

public class Main {
	public static void main(String[] args) {
		Market market = new Market();
		Human human1 = new Human("Вася");
		Human human2 = new Human("Петя");
		Human human3 = new Human("Коля");
		market.acceptToMarket(human1);
		market.acceptToMarket(human2);
		market.acceptToMarket(human3);
		market.update();
	}
}
