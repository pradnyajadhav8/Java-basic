// Replace vowels with the order they appear.
public class Example05{
	public static void main(String[] args) {
		String s="International";
		String result="";

		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='A'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				count++;
				result=result+count;
			}
			else
				result=result+ch;
		}

		System.out.print(result);
	}
}