import java.util.Arrays;

public class Example12{
	public static void main(String[] args) {
		String s=" hello i am java developer";
		String[] word=s.split(" ");
	
		for(int i=0;i<word.length;i++){
			for(int j=i+1;j<word.length;j++){
				String small=word[i];
				if(word[i].length()>word[j].length()){
					word[i]=word[j];
					word[j]=small;
				}
			}
		}

		for(String str:word){
			System.out.print(str);
			System.out.print(" ");
		}
	}
}