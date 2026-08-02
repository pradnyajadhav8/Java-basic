/*
 Write a  JAVA program to print all unique elements in the array.
*/

import java.util.Scanner;
public class Example3{
	
	public static void inputArray(int[] arr,Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter an element at location "+i+ " :");
			arr[i]=sc.nextInt();
		}
	}

	public static boolean isUnique(int[] arr, int ele){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(ele==arr[i])
				count++;
		}
		if(count>=2)
			return false;
		return true;
	}

	public static void uniqueElement(int[] arr){
		System.out.print("Array of unique element: [");
		for(int i=0;i<arr.length;i++)
			if(isUnique(arr,arr[i])==true)
				System.out.print(arr[i]+" ");
		System.out.print("]");
	}

	public static void main(String[] args) {
		System.out.println("Enter an array size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();

		int[] arr=new int[size];
		inputArray(arr,sc);

		uniqueElement(arr);
	}
}