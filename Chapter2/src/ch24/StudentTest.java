package ch24;

public class StudentTest {
	public static void main(String[] args) {

		Student Lee = new Student("Lee");
		
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학", 50);
		Lee.showStudentInfo();
		
		System.out.println();
		
		Student Kim = new Student("Kim");
		Kim.addSubject("국어", 70);
		Kim.addSubject("수학", 85);
		Kim.addSubject("영어", 100);
		Kim.showStudentInfo();
	}
}
