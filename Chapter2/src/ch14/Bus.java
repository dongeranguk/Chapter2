package ch14;

public class Bus {
	
	int busNumber;
	int money;
	int passengerCount;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + "원 이고, 승객 수는 " + passengerCount + "명 입니다.\n");
	}
	
}
