//case 25 :- WAP to reverse each element from array
// Example Input:
//input: {123,235,6754,3257,64,2367,288,35,645,374,56}
//Output:{321,532,4576,7523,46,7632,882,53,546,473,65}

public class Example25{
	public static int reverseNum(int num){
		int sum=0;
		while(num>0){
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
			int[] arr={123,235,6754,3257,64,2367,288,35,645,374,56};
			System.out.print("{");
			for (int i=0;i<arr.length;i++) {
				arr[i]=reverseNum(arr[i]);
				System.out.print(arr[i]);
				if(i<arr.length-1){
					System.out.print(", ");
				}
			}
			System.out.print("}");
	}
	
}

