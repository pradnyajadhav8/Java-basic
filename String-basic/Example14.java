//14:  Append word number (starting from 1) to each word.

import java.util.*;

public class Example14{
	public static void main(String[] args) {
		String s="hello i am java developer";
		String[] word=s.split(" ");

		for(int i=0;i<word.length;i++){
			System.out.print(word[i]+word[i].length()+" ");
		}
	}
}
