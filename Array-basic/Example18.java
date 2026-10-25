//WAP to replace each elements with their first digit of element
//input: {123,235,6754,3257,64,2367,288,35,645,374}
//Output:{1,2,6,3,6,2,2,3,6,3}

public class Example18{
	public static void main(String[] args) {
		int[] arr={123,235,6754,3257,64,2367,288,35,645,374};
		
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			while(arr[i]>10){
				arr[i]=arr[i]/10;
			}
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
