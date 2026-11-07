//Shift first charater to last
//India ---> ndiaI

public class Example01{
	public static void main(String[] args) {
		String s="India";
		String result="";
		for(int i=1;i<s.length();i++){
			result=result+s.charAt(i);
		}
		result=result+s.charAt(0);
		System.out.print(result);
	}

}
