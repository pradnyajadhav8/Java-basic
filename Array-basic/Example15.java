//Write a program to find the second largest element in an array.

public class Example15{
	public static void main(String[] args) {
		int[] arr={15, 72, 48, 96, 33, 81};
		int max=arr[0];
		int secMax=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=secMax;
				max=arr[i];
			}else if(arr[i]>secMax || arr[i]<max){
				secMax=arr[i];
			}
		}
		
		System.out.print("Second Maximum Element: "+secMax);
	}
}