//case 21:-WAP to shift last digit to first from each elements
//input: {123,235,6754,3257,64,2367,288,35,645,374}
//output:{312,523,4675,7325,46,7236,828,53,564,437}
 
public class Example21{
	public static void main(String[] args) {
		int[] arr={123,235,6754,3257,64,2367,288,35,645,374};

		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int rem=num%10;
			num=num/10;
			System.out.print(rem+""+num);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");

	}
}

