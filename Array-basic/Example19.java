//WAP to replace each elements with their first and last element
//Input :-  {123,235,6754,3257,64,2367,288,35,645,374}

public class Example19{
	public static void main(String[] args) {
		int[] arr= {123,235,6754,3257,64,2367,288,35,645,374};

		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int last=num%10;
			while(num>=9){
				num=num/10;
			}
			int result = num*10+last;
			System.out.print(result);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
