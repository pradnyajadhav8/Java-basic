//Write a program to find the maximum element in an array.

public class Example14{
	public static void main(String[] args) {
		int[] arr={12, 45, 67, 23, 89, 34};
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		
		System.out.print("Maximum Element: "+max);
	}
}