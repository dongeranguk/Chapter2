package ch09;

public class ScoreTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaScore("국어", 100);
		studentLee.setMathScore("수학", 99);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaScore("국어", 50);
		studentKim.setMathScore("수학", 65);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}
}
