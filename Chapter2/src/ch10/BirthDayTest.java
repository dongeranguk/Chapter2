package ch10;

public class BirthDayTest {
	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		
		day.setDay(30);
		day.setMonth(13);
		day.setYear(2019);
		
		day.showDayInfo();
	}
}
