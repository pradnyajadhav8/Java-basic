import java.util.Scanner;

public class Example02{
	public static void main(String[] args) {
		
		int arr[][]=new int[2][2];
		int brr[][]=new int[2][2];
		int sub[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("enter a second matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				brr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter subtraction of both matrix: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				sub[i][j]=arr[i][j]-brr[i][j];
				System.out.print(sub[i][j]+"  ");
			}
			System.out.println();
		}

	}
}