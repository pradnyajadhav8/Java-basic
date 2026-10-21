//CASE 29: Case Study (Divisible by 6 / Contains 6)

public class Example29{
	public static int newOne(int number){
		int original=number;
		int rem=0;
		if(number%6==0){
			while(number>0){
				rem=number%10;
				if(rem==6){
					return -3;
				}
				number=number/10;
			}
			return -1;
		}
		while(number>0){
			rem=number%10;
			if(rem==6){
				return -2;
			}
			number=number/10;
		}
		return original;
	}
	public static void main(String[] args) {
		int[] number=  {15,23,18,26,72,36,49,38,60,17,22,46};
		for(int i=0;i<number.length;i++){
			int num=number[i];
			number[i]=newOne(num);
		}

		System.out.print("[");
		for(int i=0;i<number.length;i++){
			System.out.print(number[i]+"  ");
		}
		System.out.print("]");
	}
}

