//Write a  JAVA program to count the total number of duplicate elements in an array.

import java.util.Scanner;
public class Example5{

	public static int frequency(int element, int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==element)
				count++;
	
		return count;
	}

	public static void inputArray(int[] arr, Scanner sc){
		System.out.print("Enter an array:  ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
	}

	public static int duplicateCount(int[] arr){
		int duplicateCount=0;
		for(int i=0;i<arr.length;i++){
			if(frequency(arr[i],arr)>=2)
				duplicateCount++;
		}
		return duplicateCount/2 ;
	}

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Size of an Array: ");
		int size=sc.nextInt();

		int[] arr=new int[size];
		inputArray(arr,sc);

		System.out.println("Total number of duplicate element in an Array : "+duplicateCount(arr));

	}
}