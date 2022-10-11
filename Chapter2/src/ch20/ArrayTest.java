package ch20;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		int num = 1;
		
		for(int i=0; i<array.length; i++, num++) {
			array[i] = num;
		}
		
		int sum = 0;
		for(int cnt : array) {
			sum += cnt;
		}
		
		System.out.println(sum);
	}
}
 