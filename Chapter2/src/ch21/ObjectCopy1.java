package ch21;

public class ObjectCopy1 {
	public static void main(String[] args) {
		// 기본 자료형은 크기가 정해져 있지만, 객체 자료형은 크기가 정해져있지 않음 따라서,
		Book[] library = new Book[5]; // 객체 배열은 요소에 초기값으로 객체가 들어있지 않고, null 값이 들어감
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); // 깊은 복사 : 객체의 참조값도 같음
		
		library[0].setAuthor("나목");
		library[0].setName("박완서");

		System.out.println("==============library==============");
		
		for(Book book : library) {
			System.out.println(book);
			book.showBookInfo();
		}
		
		System.out.println("==============copy library==============");
		
		for(Book book : library) {
			System.out.println(book);
			book.showBookInfo();
		}
	}
}
