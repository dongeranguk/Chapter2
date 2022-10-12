package ch21;

public class ObjectCopy2 {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		Book[] copyLibrary = new Book[5];
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) { // 얕은 복사 - 객체의 참초값이 다름
			copyLibrary[i].setName(library[i].getName());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		System.out.println("==========library==========");
		for(Book book : library) {
			System.out.println(book);
			book.showBookInfo();
		}
		System.out.println("==========copy library==========");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showBookInfo();
		}
	}
}
