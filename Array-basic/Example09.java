//Write a program to swap the first element and the last element of an array.
//Array = [10, 20, 30, 40, 50]

public class Example09{
	public static void main(String[] args) {
		int[] arr={10, 20, 30, 40, 50};
		System.out.print("Before Swap an Array: {");
		for(int num: arr){
			System.out.print(num+"  ");
		}
		System.out.println("}");

		System.out.print("After swap an Array: {");
		int first=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=first;
		for(int num: arr){
			System.out.print(num+"  ");
		}
		System.out.print("}");
	}
}

