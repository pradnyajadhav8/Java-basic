//Write a Java program to find the sum of each row and column of a matrix.
import java.util.Scanner;

public class Example07{
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[0].length;j++){
				sum=sum+arr[i][j];
			}
			System.out.println("Row"+i+":"+sum);
		}

		for(int j=0;j<arr.length;j++){
			int sum=0;
			for(int i=0;i<arr[0].length;i++){
				sum=sum+arr[i][j];
			}
			System.out.println("column"+j+":"+sum);
		}

	}
}
