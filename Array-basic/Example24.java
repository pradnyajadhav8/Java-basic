//Case 24:-WAP to replace each element with their avg of digit
//input: {123,235,6754,3257,64,2367,288,35,645,374,56}
//Output: {2, 3, 5, 4, 5, 4, 6, 4, 5, 4, 5}

public class Example24{
	public static void main(String[] args) {
		int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};

		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			int count=0;int sum=0;
			int num=arr[i];
			while(num>0){
				int rem=num%10;
				sum+=rem;
				num=num/10;
				count++;
			}
			int avg=sum/count;
			System.out.print(avg);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");

	}
}

