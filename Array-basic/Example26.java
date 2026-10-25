//case 26- Replace Each element with Highest digit

//input:- {123,235,6754,3257,64,2367,288,35,645,374,56}
//output:{3, 5, 7, 7, 6, 7, 8, 5, 6, 7, 6}

public class Example26{
	public static void main(String[] args) {
		int[] arr={123,235,6754,3257,64,2367,288,35,645,374,56};

		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int max=0;
			while(num>0){
				int rem=num%10;
				if(rem>max){
					max=rem;
				}
				num=num/10;
			}
			arr[i]=max;
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
