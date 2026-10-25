//Shift First Element to Last
//input: {10,20,30,40,50}
//output:{20,30,40,50,10}

public class Example07{
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int first=arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;

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
