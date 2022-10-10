package ch14;

public class Student {
	
	String name;
	int money;
	
	public Student() {}
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		System.out.println(name + " 학생의 남은 돈 : " + money);
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
		System.out.println(name + " 학생의 남은 돈 : " + money);
	}
	
}
