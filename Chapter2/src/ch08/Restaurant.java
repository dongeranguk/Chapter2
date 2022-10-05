package ch08;

public class Restaurant {

	String menuNumber;
	int price;
	
	public Restaurant() {}
	
	public Restaurant(String menuNumber, int price) {
		this.menuNumber = menuNumber;
		this.price = price;
	}
	
	public void receiveOrder(Order order) {
		order.showOrderInfo();
		System.out.println(menuNumber);
		System.out.println(price);
	}
}
