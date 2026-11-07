//Swap the first and last characters of the string.
// India - andiI

public class Example03{
	public static void main(String[] args) {
		
		String s="India";
		char[] ch=s.toCharArray();

		char x=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=x;

		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		
	}
}
