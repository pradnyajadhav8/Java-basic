// Count the number of vowels in the string.

public class Example04{
	public static void main(String[] args) {
		String s="Education";
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='A'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				count++;
			}
		}

		System.out.print(count);
	}
}
