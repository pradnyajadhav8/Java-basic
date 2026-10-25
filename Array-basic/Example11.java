//Write a program to move the first element of the array to the last position (shift left by one) without using a third variable.
import java.util.*;

public class Example11{
	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 5};
		System.out.println("After shift an Array: "+Arrays.toString(arr));

		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i]+arr[i+1];
			arr[i+1]=arr[i]-arr[i+1];
			arr[i]=arr[i]-arr[i+1];
		}

		System.out.println("Before shift an array: "+Arrays.toString(arr));
	}
}
