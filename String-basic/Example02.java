public class Example02{
	public static void main(String[] args) {
		
		String s= "India";
		String result="";

		result=result+s.charAt(s.length()-1);
		for(int i=0;i<s.length()-1;i++){
			result=result+s.charAt(i);
		}

		System.out.print(result);
	}
}