//Example11: Sort all words in dictionary (alphabetical) order.

public class Example11{
	public static void main(String[] args) {
		String str="hello i am java developer";
		String word[]=str.split(" ");

		for(int i=0;i<word.length-1;i++){
			for(int j=i+1;j<word.length;j++){
				if(word[i].compareTo(word[j])>0){
					String temp=word[i];
					word[i]=word[j];
					word[j]=temp;
				}
			}
		}

		for(int i=0;i<word.length;i++){
			System.out.print(word[i]+" ");
		}
	}
}