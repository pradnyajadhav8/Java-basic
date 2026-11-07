//Write a Java program to check whether two matrices are equal or not.
import java.util.Scanner;

public class Example04{
	public static void main(String[] args) {
		boolean equal=true;
		int arr[][]=new int[2][2];
		int brr[][]=new int[2][2];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter 2nd Matrix:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				brr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]!=brr[i][j]){
					equal=false;
					break;
				}
			}
		}

		if(equal==true){
			System.out.print("Given two matrix are equal..!");
		}else{
			System.out.print("Given two matrux are unequal..!");
		}
	}
}