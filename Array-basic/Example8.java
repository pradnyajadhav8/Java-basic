import java.util.Scanner;

//Write a Java program to insert an element into an array at a specified position.
public class Example8{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert the Position:");
		int position=sc.nextInt();
		System.out.print("Enter an element: ");
		int element=sc.nextInt();

		int[] array=new int[9];
		System.out.println("Enter an array elements: ");
		for(int i=0;i<9;i++){
			array[i]=sc.nextInt();
		}
		System.out.println();

		for(int i=0;i<9;i++){
			if(position == i+1){
				array[i]=element;
			}
		}
		for(int i=0;i<9;i++){
			System.out.print(array[i]+"  ");
		}
	}
}