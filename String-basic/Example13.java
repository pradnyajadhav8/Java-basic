//EX:13) Reverse each individual word in the sentence.

import java.util.*;

public class Example13{
	public static void main(String[] args) {
		String s="hello i am java developer";
		String[] word=s.split(" ");

		for(int i=0;i<word.length;i++){
			char[] ch=word[i].toCharArray();
			for(int j=0;j<ch.length/2;j++){
				char tp=ch[j];
				ch[j]=ch[ch.length-1-j];
				ch[ch.length-1-j]=tp;
			}
			word[i]=new String(ch);
		}
		
		for(String str:word){
			System.out.print(str+" ");
		}

	}
}
