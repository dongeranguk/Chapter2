package ch08;

public class Person {
	
	int height;
	int weight;
	String name;
	int age;
	
	public Person() {}
	
	public Person(int height, int weight, String name, int age) {
		System.out.println(name + " 생성");
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public Order order(Order order) {
		System.out.println(this.name + "이 주문을 합니다.");
		return order;
	}
}
