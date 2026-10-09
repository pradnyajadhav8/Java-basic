import java.util.ArrayList;
import java.util.List;
class Example102{
	
	public static void main(String[] args) {
		
		ArrayList<String>singers=new ArrayList<String>();
		singers.add("Arjit");
		singers.add("Lata");
		singers.add("Udit Naryan");
		singers.add("Kishor Kumar");
		singers.add("Shreya Ghosal");
		singers.add("Alka");

		System.out.println(singers);
		singers.add(2,"Sonu Nigam");
		System.out.println(singers);

		//public E get(int index)

		//public set(int index,E e)
		singers.set(1,"Asha Bhosale");

		System.out.println(singers);

		System.out.println("index : "+singers.indexOf("Lata"));
		System.out.println("index : "+singers.indexOf("Alka"));

		//From-0   <to(3)
		List<String>playbackSinger=singers.subList(0,3);
		System.out.println(playbackSinger);

	}
}