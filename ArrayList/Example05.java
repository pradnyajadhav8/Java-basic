
import java.util.ArrayList;
import java.util.Iterator;
class Example101{
	
	public static void main(String[] args) {
		
		ArrayList<String>movies1=new ArrayList<String>();
		ArrayList<String>movies2=new ArrayList<String>();

		movies1.add("300");
		movies1.add("500");
		movies1.add("Dhurandar");
		movies1.add("Welcome");
		movies1.add("Animal");

		movies2.add("Murder");
		movies2.add("Gajani");
		movies2.add("Welcome");
		movies2.add("Sirf Tum");
		movies2.add("500");

		// System.out.println(movies1);
		// System.out.println(movies2);
		// movies1.retainAll(movies2);
		// System.out.println(movies1);
		// System.out.println(movies2);

		Iterator<String>itr=movies1.iterator();

		//Showing essential things from an Iterator abstraction.
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}
}