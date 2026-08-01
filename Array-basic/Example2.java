//Write a Java program to insert an element into an array at a specified position.

import java.util.*;

public class Example2{

	public static int[] atPositionArray(int pos,int[] arr,int element,int size){
		int size1=size+1;
		int[] arr1=new int[size1];
		for(int i=0;i<pos;i++){
			if(pos==i+1)
				arr1[i]=element;
			else
				arr1[i]=arr[i];
		}
		for(int i=pos;i<size1;i++){
			arr1[i]=arr[i-1];
		}
		return arr1;
	} 

	public static void printArray(int[] arr,int size){

		System.out.print("{");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+"  ");
		System.out.print("}");
	}

	public static int[] enterArray(int[] arr,Scanner sc,int size){

		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the size of an array: ");
		Scanner sc=new Scanner(System.in); 

		int size=sc.nextInt();
		int[] arr=new int[size];
		enterArray(arr,sc,size);

		System.out.println("Enter an position where you want to add an Element:");
		int pos=sc.nextInt();
		System.out.print("Enter an Element: ");
		int element=sc.nextInt();
		
		printArray(atPositionArray(pos,arr,element,size),size+1);
	}
}