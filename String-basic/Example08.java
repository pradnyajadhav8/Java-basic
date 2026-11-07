/*/ Sort All Characters Alphabetically

Problem: Sort characters of string alphabetically.

Input: international

Output: aaeiilnnnortt
*/

public class Example08{
	public static void main(String[] args) {
		String s="international";
		char[] ch=new char[s.length()];

		for(int i=0;i<s.length();i++){
			ch[i]=s.charAt(i);
		}

		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]>ch[j]){
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}

		System.out.print(new String(ch));
	}
}