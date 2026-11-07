//Write a Java Program to find the sum of main digonal elements of a matrix.
import java.util.Scanner;

public class Example05{
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter a matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print("Sum Of Matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j){
					sum+=arr[i][j];
				}
			}
		}
		System.out.print(sum);
	}
}