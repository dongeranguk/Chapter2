package ch09;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student() {}
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject(); // 참조 자료형은 new 키워드를 이용해 생성자를 호출하여 초기화해야 사용 가능
		math = new Subject();
	}
	
	public void setKoreaScore(String subjectName, int score) {
		korea.subjectName = subjectName;
		korea.score = score;
	}
	
	public void setMathScore(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
