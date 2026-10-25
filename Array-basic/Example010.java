// Write a program to swap the first element and the last element of an array without using a third (temporary) variable.

public class Example010{
	public static void main(String[] args) {
		int[] arr={7, 14, 21, 28, 35};
		arr[0]=arr[0]+arr[arr.length-1];
		arr[arr.length-1]=arr[0]-arr[arr.length-1];
		arr[0]=arr[0]-arr[arr.length-1];
		
		System.out.print("{");
		for(int num: arr){
			System.out.print(num+"  ");
		}
		System.out.print("}");
	}
}
