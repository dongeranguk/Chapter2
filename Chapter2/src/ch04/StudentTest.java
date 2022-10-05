package ch04;

public class StudentTest {
	public static void main(String[] args) {

		//인스턴스(=객체) 생성
		Student student = new Student();
		
		student.studentID = 12345;
		student.setStudentName("김동욱");
		student.address = "서울 강남구";
		
		student.showStudentInfo();
		
		Student student2 = new Student();
		
		student2.studentID = 54321;
		student2.studentName = "Lee";
		student.address = "경기도 성남시";
		
		student.showStudentInfo();
		
	}
}
