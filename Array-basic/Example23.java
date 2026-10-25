//Case 23:- WAP to replace each elements with their sum of digit
//input: {123,235,6754,3257,64,2367,288,35,645,374,56}
//Output: {6, 10, 22, 17, 10, 18, 18, 8, 15, 14, 11}

public class Example23{
	public static void main(String[] args) {
		int[] arr={123,235,6754,3257,64,2367,288,35,645,374,56};
		
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int sum=0;
			while(num>0){
				int rem=num%10;
				sum+=rem;
				num=num/10;
			}
			arr[i]=sum;
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}

