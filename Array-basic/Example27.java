//case 27: Append sum of digit to each element at last of Elemant
//Input : {123,235,6754,3257,64,2367,288,35,645,374,56};
//Output: {1236,23510,675422,325717,6410,236718,28818,358,64515,37411,5611};

public class Example27{
	public static void main(String[] args) {
		int[] arr={123,235,6754,3257,64,2367,288,35,645,374,56};

		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int sum=0;
			while(num>0){
				sum=sum+num%10;
				num=num/10;
			}
			
			System.out.print(arr[i]+""+sum);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
