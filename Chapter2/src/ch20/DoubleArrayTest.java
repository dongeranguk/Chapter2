package ch20;

public class DoubleArrayTest {
	public static void main(String[] args) {

		Double[] dArr = new Double[5];

		dArr[0] = 3.14;
		dArr[1] = 2.5;
		dArr[2] = 5.9;

		int sum = 0;
		for (int i = 0; i < dArr.length; i++) {
			// sum *= dArr[i]; 배열의 길이는 요소의 갯수와 일치하지 않으므로 빈 요소를 참조하고자하면 NullPointerException 발생
		}
		
		Double[] dArr2 = new Double[5];
		int count = 0;
		
		dArr2[0] = 3.14; count++;
		dArr2[1] = 2.5; count++;
		dArr2[2] = 5.9; count++;
		
		double sum2 = 1;
		for(int i=0; i<count; i++) {
			sum2 *= dArr[i];
		}
		
		System.out.println(sum2);
	}
}
