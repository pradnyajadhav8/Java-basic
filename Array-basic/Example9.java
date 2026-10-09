//Write a Java program to delete an element from an array at a specified position.
import java.util.Scanner;

public class Example9{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size: ");
		int size=sc.nextInt();
		System.out.println("Enter an position: ");
		int position=sc.nextInt();

		int[] array=new int[size];
		System.out.println("Enter an array: ");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}

		for(int i=0;i<position-1;i++){
			System.out.print(array[i]+"  ");
		}

		for(int i=position;i<size;i++){
			System.out.print(array[i]+"  ");
		}
		
	}
}