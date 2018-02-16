import java.util.*;
/**
 * This is a short program to demonstrate the difference between wrapper classes
 * and primitives.
 * 
 * @author Michael Ida
 *
 */
public class WrapperClassDemo {

	public static void main(String[] args) {
		sortNumbers();
	}
	
	
	public static void sortNumbers() {
		Integer arraySize;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter The Size Of Your Array");
		arraySize = Integer.valueOf(scnr.nextInt());
		Integer[] array = new Integer[arraySize];
		Integer largeInt = Integer.MIN_VALUE;
		Integer tempInt;
		Integer i;
		Integer j;
		
		for(i = Integer.valueOf(0); i.compareTo(arraySize) < 0; i = Integer.sum(i, 1)) {
			System.out.println("Enter Your Next Number: " + i.toString() + "/" + arraySize.toString() + " Numbers Typed");
			array[i.intValue()] = scnr.nextInt();
		}
		
        for(i = 0; i < arraySize - 1; i++) {
            for (j = 0; j < arraySize - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tempInt = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempInt;
                }
            }
        }
        
        for(i = 0; i < arraySize; i++) {
        	System.out.println(array[i]);
        }
	}
}
