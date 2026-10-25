//Array Case 28: Case Study (Divisible by 4 and/or 5)
//black /4
//White /5
//grey -- black + white

public class Example28{
	public static int newAdd(int num){
		int original=num;
		if(num%4==0){
			if(num%5==0){
				return -3;
			}
			return -1;
		}
		if(num%5==0){
			return -2;
		}
		return original;
	}
	public static void main(String[] args) {
		int[] arr={10,14,24,12,18,26,20,23,22,15,26};
		for(int i=0;i<arr.length;i++){
			arr[i]=newAdd(arr[i]);
		}
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.print("}");
	}
}