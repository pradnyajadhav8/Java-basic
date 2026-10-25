//Write a program to find all pairs of two elements in an array whose sum is equal to a given number.

public class Example16{
	public static void main(String[] args) {
		int[] arr={4, 8, 12, 16};
		int target=20;
		System.out.println("Pairs with sum 20 : ");

		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(target==arr[i]+arr[j]){
					System.out.println("("+arr[i]+", "+arr[j]+")");
				}
			}
		}

	}
}