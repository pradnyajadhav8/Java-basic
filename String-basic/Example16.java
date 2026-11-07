/*: Move first character of every word to the end.

Input: hello i am java developer

Output: elloh i ma avaj eveloperd
*/

public class Example16{
	public static void main(String[] args) {
		String s="hello i am java developer";
		String[] word=s.split(" ");

		for(int i=0;i<word.length;i++){
			char[] ch=word[i].toCharArray();
			for(int j=0;j<word[i].length()-1;j++){
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
			word[i]=new String(ch);
		}

		for(String str:word){
			System.out.print(str+" ");
		}

	}
}