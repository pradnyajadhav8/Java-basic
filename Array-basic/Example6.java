/*
Write a Java program to delete all duplicate elements from an array.
*/

import java.util.Scanner;
public class Example6{

	public static void inputArray(int[] arr, Scanner sc){
		System.out.print("Enter an array:  ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
	}

	public static void printArray(int[] arr){
		System.out.print("{");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		System.out.print("}");
	}

	public static int frequency(int element, int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==element)
				count++;
	
		return count;
	}

	public static int[] deleteDuplicate(int[] arr){
		int[] arr1=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(frequency(arr[i],arr)<=1){
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Size of an Array: ");
		int size=sc.nextInt();

		int[] arr=new int[size];
		inputArray(arr,sc);

		printArray(deleteDuplicate(arr));

	}

}