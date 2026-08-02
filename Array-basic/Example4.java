/*
 Write a  JAVA program to count the frequency of each element in an array.
*/
import java.util.Scanner;

public class Example4{
	public static int frequency(int element, int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==element)
				count++;
	
		return count;
	}

	public static void printFrequency(int[] arr){
		System.out.println("Frequency of each element in an Array.");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" : "+frequency(arr[i],arr));
		}
	}

	public static void inputArray(int[] arr,Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter an element at location "+i+ " :");
			arr[i]=sc.nextInt();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Size of an Array: ");
		int size=sc.nextInt();

		int[] arr=new int[size];
		inputArray(arr,sc);

		printFrequency(arr);
	}
}