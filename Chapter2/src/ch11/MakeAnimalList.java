package ch11;

public class MakeAnimalList {
	/*
	 * 캡슐화의 장점
	 * 1. 공개하고자 하는 정보와 기능만 공개
	 * 2. 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현하게 함
	 * 3. 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류 최소화
	 */
	private String line = "=============================================\n";
	private String title = "  이름\t 종\t나이\t  출생지\t   \n";
	
	StringBuffer buffer = new StringBuffer();
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("  맥스\t");
		buffer.append("호랑이\t");
		buffer.append("3살\t");
		buffer.append("시베리아\n");
		
		buffer.append(" 라이키\t");
		buffer.append("멧돼지\t");
		buffer.append("5살\t");
		buffer.append(" 한국\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String makeList() {
		makeHeader();
		generateBody();
		makeFooter();
		
		return buffer.toString();
	}
}
