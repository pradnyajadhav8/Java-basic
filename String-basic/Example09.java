/*
 Q9. Count Words in a Sentence

Problem: Count the number of words in a sentence.

Input: hello i am java developer

Output: 5
*/

public class Example09{
	public static void main(String[] args) {
		int count=0;
		String s="hello i am java developer";

		// for(int i=0;i<s.length();i++){
		// 	if(s.charAt(i) != ' ' && i==0||s.charAt(i-1)==' '){
		// 		count++;
		// 	}
		// }

		String[] word= s.split(" ");

		System.out.print(word.length);
		//System.out.print(count);
	}
}