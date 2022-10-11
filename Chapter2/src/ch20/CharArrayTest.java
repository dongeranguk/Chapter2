package ch20;

public class CharArrayTest {
	public static void main(String[] args) {
		char[] cArr = new char[26];
		char[] cArr2 = new char[26];
		
		int cnt = 65;
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = (char)cnt;
			cnt++;
		}
		
		char c = 'A';
		
		for(int i=0; i<cArr2.length; i++) {
			cArr2[i] = c++;
		}
		
		for(char ch : cArr) { // 배열의 n개 요소를 0부터 n-1까지 순차적으로 순회
			System.out.println(ch + "," + (int)ch);
		}
		System.out.println();
		for(char ch2 : cArr2) {
			System.out.print(ch2 + " ");
		}
	}
}
