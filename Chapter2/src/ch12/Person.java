package ch12;

public class Person {
	/*
	 * this
	 * 객체 자신을 가리키는 this
	 * 1. 생성된 인스턴스 메모리의 주소를 가짐
	 * 2. 생성자에서 또 다른 생성자를 호출할 때 사용
	 * 3. 자신의 주소(참조값)을 반환
	 */
	
	String name;
	int age;
	
	
	public Person() {
		this("이름 없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
