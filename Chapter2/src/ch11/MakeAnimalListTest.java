package ch11;

public class MakeAnimalListTest {
	public static void main(String[] args) {
		MakeAnimalList builder = new MakeAnimalList();
		
		String list = builder.makeList();
		
		System.out.println(list);
	}
}
