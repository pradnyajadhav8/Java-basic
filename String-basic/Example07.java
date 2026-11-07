// Separate consonants and vowels. Keep consonants in order and append sorted vowels.
import java.util.Arrays;

public class Example07{
	public static void main(String[] args) {
		String s="International";
		String vowel="";
		String consonants="";

		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);

			if("aeiouAEIOU".indexOf(ch) != -1){
				vowel=vowel+ch;
			}
			else{
				consonants=consonants+ch;
			}

		}
		char[] arr=vowel.toCharArray();
			Arrays.sort(arr);

		System.out.println(consonants+new String(arr));
	}
}