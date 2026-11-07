//Write a Java program to find the sum of minor 
//diagonal elements of a matrix.
import java.util.Scanner;

public class Example06{
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		System.out.print("Enter a matrix:");

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		int sum=0;
		System.out.print("Enter sum of minor diagonal element: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i+j==arr.length-1){
					sum+=arr[i][j];
				}
			}
		}
		System.out.print(sum);
	}
}
