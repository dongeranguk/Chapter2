package ch08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderTest {
	public static void main(String[] args) {
		Person tomas = new Person(180, 768, "Tomas", 37);
		Restaurant restaurant = new Restaurant("0003", 35000);
		Order order = new Order("20201102" + restaurant.menuNumber, "01023450001", "서울시 강남구 역삼동 111-333", "20201102", "130258", 35000);
		
		tomas.order(order);
		order.showOrderInfo();
		
	}
}
