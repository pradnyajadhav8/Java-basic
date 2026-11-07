//Perform Scalar matrix multiplication.
import java.util.Scanner;

public class Example03{
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		int brr[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter an scalar :");
		int scalar=sc.nextInt();

		System.out.println("enter a matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("After Scalar Multiplication:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=scalar*arr[i][j];
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}