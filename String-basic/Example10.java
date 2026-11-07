//Problem: Print the longest word in a sentence.

public class Example10{
	public static void main(String[] args) {
		String s= "welcome to international airport";
		// String word="";
		// String longest="";

		// for(int i=0;i<s.length();i++){
		// 	if(s.charAt(i)!=' '){
		// 		word=word+s.charAt(i);
		// 	}else {
		// 		if(word.length() > longest.length()){
		// 		longest=word;
		// 		}
		// 		word="";
		// 	}

		// 	if(word.length() > longest.length()){
		// 		longest=word;
		// 	}
		// }

		// System.out.print(longest);

		String[] word=s.split(" ");
		String longest="";
		for(int i=0;i<word.length;i++){
			if(word[i].length() > longest.length()){
				longest=word[i];
			}
		}
		System.out.print(longest);
	}
}