//case 20:- WAP to replace first digit at last of element
//input :-{123,235,6754,3257,64,2367,288,35,645,374}
//output:{231,352,7546,2573,46,3672,882,53,456,743}
import java.util.*;
public class Example20{
	public static void main(String[] args) {
		int[] arr= {123,235,6754,3257,64,2367,288,35,645,374};
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int count=0;
			while(num>=9){
				count++;
				num=num/10;
			}
			int rem=arr[i] % (int)Math.pow(10,count);
			int result=rem*10+num;
			System.out.print(result);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
