//WAP to shift last element to first from array.
//input: {10,20,30,40,50}
//Output:{50,10,20,30,40}

public class Example08{
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50};
		int last=arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--){
			if(i==0){
				arr[i]=last;
			}else{
				arr[i]=arr[i-1];
			}
		}

		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
