//Replace vowels (right to left) with the order they appear.
//Input: International
//Output: 6nt5rn4t32n1l

public class Example06{
	public static void main(String[] args) {
		String s= "International";

		String result="";
		int count=0;
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			if(ch=='A'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				count++;
				result=count+result;
			}
			else
				result=ch+result;
		}

		System.out.print(result);
	}
}
