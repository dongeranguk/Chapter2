package ch14;

public class TakeTransTest {
	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 4000);
		
		Bus bus500 = new Bus(500);
		Bus bus100 = new Bus(100);
		
		studentJ.takeBus(bus500);
		bus500.showBusInfo();
		
		bus100.showBusInfo();
		
		
		Subway greenSubway = new Subway(2);

		studentT.takeSubway(greenSubway);
		greenSubway.showSubwayInfo();
	}
}
