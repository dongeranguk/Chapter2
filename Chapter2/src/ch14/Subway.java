package ch14;

public class Subway {
	int lineNumber;
	int money;
	int passengerCount;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "호선의 지하철의 수입은 " + money + "원 이고, 승객 수는 " + passengerCount + "명 입니다.\n");
	}
}
