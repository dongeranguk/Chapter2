package ch08;

public class Order {

	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	
	public Order() {}
	
	public Order(String orderNumber, String phoneNumber, String address, String orderDate, String orderTime, int orderPrice) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
	}
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + phoneNumber);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		
	}
}
