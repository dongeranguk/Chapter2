package ch15;

public class Student {
	String name;
	int money;
	
	public Student() {}
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) { 
		taxi.take(10000);
		this.money -= 10000;
		System.out.println(name + " 학생의 남은 돈 : " + money);
	}
}
