import java.util.ArrayList;
import java.util.Scanner;

public class Example04{
	
	public static void main(String[] args) {

		ArrayList<Integer> list= new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		//Write a Java program to find the sum of all array elements. 
		System.out.println("Enter an array size: ");
		int size = sc.nextInt();

		System.out.print("Enter an array element: ");
		for(int i=0;i<size;i++)
			list.add(sc.nextInt());
	
		System.out.println(list);
		int sum=0;

		for(int i=0;i<size;i++)
			sum=sum+list.get(i);

		System.out.print("Sum of ArrayList : "+ sum );
			
	}
}