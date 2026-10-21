//Write a Java program to delete all duplicate elements from an array.
import java.util.Scanner;

public class Example10{
	public static void main(String[] args) {
		
		int[] arr = {15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46};
		int[] arr1=new int[arr.length];
	
		for(int i=0;i<arr.length-1;i++){
			if(i==(arr.length-1)){
				arr1[arr.length-1]=arr[arr.length-1]-arr[arr.length-2];
			}else{
				arr1[i]=arr[i]-arr[i+1];
			}
		}
		
		System.out.print("[");
		for(int i=0;i<arr1.length-1;i++){
			if(arr1[i]<0){
				arr1[i] = arr1[i] - 2*arr1[i];
				System.out.print(arr1[i]+" ");
			}
			else{
				System.out.print(arr1[i]+" ");
			}
		}
		System.out.print("]");
	}
}
