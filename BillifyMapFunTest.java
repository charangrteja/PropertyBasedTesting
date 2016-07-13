import org.junit.*;
import static org.junit.Assert.*;

public class BillifyMapFunTest {
/*
 * This test case will test the length of the output array. The length of the output array 
 * should always be greater than length of input array by 1. If this condition is not satisfied,
 * the test will fail
*/
	@Test
	public void testOutputArrayLength() {
//		This loop will generate 100 arrays of different lengths
		for (int i=0; i<100;i++){
//			generating input array by calling generateArray() from main class
			int[] input= BillifyMapFun.generateArray();
//			passes the input array to the billify map function to create an output array
			int[] output = BillifyMapFun.billify(input);
//			compares the length of input array to output array
			int length = output.length-input.length;
//			The length difference between the output and input array should always be 1, else fail.
			assertEquals(length,1);
		}
					
	}
	
/*
 *This test case will verify that the input array has values that are between 1 and 100.
 *The values generated by random function should always be between 1 and 100. If this condition is 
 *not satisfied, the test will fail. 
 */
	@Test
	public void testInputArrayValues() {
//		This loop will generate 100 arrays of different lengths
		for (int i=0; i<100;i++){
//			generating input array by calling generateArray() from main class
			int[] input= BillifyMapFun.generateArray();
//			looping through the elements of input array
			for(int j=0;j<input.length;j++){
//				verifying values are between 1 and 100
				assertTrue(input[j]>=1 && input[j]<=100);
			}
			
		}
					
	}

/*
 * This test case will verify if the elements in the output array are square of the elements 
 * from the input array. 
*/
	@Test
	public void testBillifyFunc() {
//		This loop will generate 100 arrays of different lengths
		for (int i=0; i<100;i++){
//			generating input array by calling generateArray() from main class
			int[] input= BillifyMapFun.generateArray();
//			passes the input array to the billify map function to create an output array
			int[] output = BillifyMapFun.billify(input);
			for(int j=0;j<input.length;j++){
				int source=input[j]*input[j];
				int target=output[j];
				assertEquals(source,target);
			}
		}
					
	}
	
	
/*
 * This test case will verify if the sum of the length-1 elements of output array is equal to the 
 * last element of the output array
 */
	@Test
	public void testSumofSquaredErrors() {
//		This loop will generate 100 arrays of different lengths
		for (int i=0; i<100;i++){
//			generating input array by calling generateArray() from main class
			int[] input= BillifyMapFun.generateArray();
//			passes the input array to the billify map function to create an output array
			int[] output = BillifyMapFun.billify(input);
			int sum=0;
//			looping through the first length-1 elements of output array and calculating sum
			for(int j=0;j<output.length-1;j++){
				sum=sum+output[j];
			}
//			testing if calculated value is equal to expected value.
			assertEquals(sum,output[input.length]);
		}
					
	}
	


}