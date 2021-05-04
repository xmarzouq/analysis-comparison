import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Test {
	private static SecureRandom sr;
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		int[] test, array51, array52;
		Ex01 obj = new Ex01();
		test = fillArray(10000);
		
		array51 = fillArray(1000);
		array52 = fillArray(1000);
		
		long startTime1 = System.nanoTime();
		int result1 = obj.example1(test);
		long endTime1 = System.nanoTime();
		long elapsed1 = endTime1 - startTime1;
		System.out.println("Time for method 1: " + elapsed1);
		
		
		long startTime2 = System.nanoTime();
		int result2 = obj.example2(test);
		long endTime2 = System.nanoTime();
		long elapsed2 = endTime2 - startTime2;
		System.out.println("Time for method 2: " + elapsed2);

		
		long startTime3 = System.nanoTime();
		int result3 = obj.example3(test);
		long endTime3 = System.nanoTime();
		long elapsed3 = endTime3 - startTime3;
		System.out.println("Time for method 3: " + elapsed3);
		
		
		long startTime4 = System.nanoTime();
		int result4 = obj.example4(test);
		long endTime4 = System.nanoTime();
		long elapsed4 = endTime4 - startTime4;
		System.out.println("Time for method 4: " + elapsed4);
		
		
		long startTime51 = System.nanoTime();
		int result5 = obj.example5(test, test);
		long endTime51 = System.nanoTime();
		long elapsed51 = endTime51 - startTime51;
		System.out.println("Time for method 5: " + elapsed51);
		
		
	}
	
	public static int[] fillArray(int size) throws NoSuchAlgorithmException {
		sr = SecureRandom.getInstance("SHA1PRNG");
		int[] array = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = sr.nextInt();
		}
		return array;
	}
}
