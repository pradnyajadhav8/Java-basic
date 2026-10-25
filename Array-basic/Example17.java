//Write a program to find all triplets of three elements in an array whose sum is equal to a given number.

public class Example17{
	public static void main(String[] args) {
		int[] arr={3, 6, 9, 12, 15};
		int target=30;
		System.out.println("Triplets with sum 30: ");

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					int add=arr[i]+arr[j]+arr[k];
					if(target==add){
						System.out.println("("+arr[i]+", "+arr[j]+", "+arr[k]+")");
					}
				}
			}
		}
	}
}
