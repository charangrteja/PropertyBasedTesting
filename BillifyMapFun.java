
import java.util.Random;

public class BillifyMapFun {
//	Declaring random variable to generate random values
	static Random rand=new Random();
//	Main function 
	public static void main(String[] args) {
	
	}
//	Function to generate array of variable length and values between 1 to 100
	public static  int[] generateArray(){
//		create input array of variable length
		int[] input= new int[rand.nextInt(100)+1];
//		assign random values between 1 to 100 to the array
		for (int i=0;i<input.length;i++){
			input[i]=rand.nextInt(100)+1;
		}
	return input;
	
}
	
//	Declaring billify map function
	public static int[] billify(int[] input){
//		creating output array that has length greater than input array by 1;
		int[] output = new int [input.length+1];
		int sum = 0;
//		looping through output array length to assign squared vales
		for (int i=0; i<input.length;i++){
			int value = input[i];
//			squaring the values
			value = value*value;
			output[i]=value;
//			calculating the sum of elements
			sum+=value;
		}
//		storing sum in last element of the output array
		output[input.length]=sum;
		return output;
	}

}
