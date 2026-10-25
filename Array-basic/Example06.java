//Case 6:- Element Greater than Average.
/*	Find the average of the array,and then display all elements that are greater that this average.
Average = [3,7,9,2,6]
step 1:- Average =(3+7+9+2+6)/5=27/5=5.4
step 2:- Elements greater than 5.4 at 7,9,6.
*/

public class Example06{
	public static void main(String[] args) {
		int[] arr={3,7,9,2,6};double sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("Average :"+avg);
		System.out.println("Elements Greater than average: ");
		for(int i=0;i<arr.length;i++){
			if(avg<arr[i]){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
