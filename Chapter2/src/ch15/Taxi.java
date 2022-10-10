package ch15;

public class Taxi {
	String corp;
	int money;
	int passengerCount;
	
	public Taxi() {}
	
	public Taxi(String corp) {
		this.corp = corp;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	public void showTaxiInfo() {
		System.out.println(corp + " 택시의 수입은 " + money + "원 이며, 오늘 총 승객 수는 " + passengerCount + "명 입니다.");
	}
}
