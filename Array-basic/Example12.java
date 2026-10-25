//Write a program to move the last element of the array to the first position (shift right by one) without using a third variable.
import java.util.Arrays;
public class Example12{
	public static void main(String[] args) {
		int[] arr={10, 20, 30, 40, 50};
		System.out.println("After shift an array: "+Arrays.toString(arr));

		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i]+arr[i-1];
			arr[i-1]=arr[i]-arr[i-1];
			arr[i]=arr[i]-arr[i-1];
		}

		System.out.println("Before shift an array: "+Arrays.toString(arr));
	}
}