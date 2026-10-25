//Write a program to reverse all elements of an array without using a third variable.
import java.util.Arrays;
public class Example13{
	public static void main(String[] args) {
		int[] arr={5,10,15,20,25};

		System.out.println("After the Reverse an array: "+Arrays.toString(arr));

		for(int i=0;i<arr.length/2;i++){
			arr[i]=arr[i]+arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i]-arr[arr.length-1-i];
			arr[i]=arr[i]-arr[arr.length-1-i];
		}

		System.out.print("Before Reverse an array: "+Arrays.toString(arr));
	}
}