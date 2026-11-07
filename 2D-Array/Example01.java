//WAP to add two matrices.
import java.util.Scanner;

public class Example01{
	public static void main(String[] args) {
		int [][]arr=new int[2][2];
		int [][]brr=new int[2][2];
		int [][]sum=new int[2][2];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1st matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter second matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				brr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Here is sum of both matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				sum[i][j]=arr[i][j]+brr[i][j];
				System.out.print(sum[i][j]+ "  ");
			}
			System.out.println();
		}
	}
}
