package ch24;

import java.util.ArrayList;

public class Student {
	public static int serialNum = 1000;
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		serialNum++;
		this.studentID = serialNum;
		this.studentName = studentName;
		this.subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			total += s.getScore();
		
			System.out.println(studentName +"(" + studentID + ")" + " 학생의 "  +  s.getName() + "과목 성적은 " + s.getScore() + "점 입니다.");
		}
		
		System.out.println(studentName + " 학생의 총점은 " + total+ "점 입니다.");
	}
	
}
