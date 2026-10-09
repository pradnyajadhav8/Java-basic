import java.util.ArrayList;
import java.util.List;

public class Example02{
	
	public static void main(String[] args) {
		//addAll();
		//containsAll();
		//removeAll();
		//retainAll();

		List<String>kabhikusshikabhigamcast1=new ArrayList<>();
		kabhikusshikabhigamcast1.add("Shahrukh khan");
		kabhikusshikabhigamcast1.add("Amitabh");
		kabhikusshikabhigamcast1.add("kajol");
		kabhikusshikabhigamcast1.add("kareena Kapoor");
		kabhikusshikabhigamcast1.add("Hrutik");

		List<String>kuchkuchhotahaicast2=new ArrayList<>();
		kuchkuchhotahaicast2.add("Shahrukh khan");
		kuchkuchhotahaicast2.add("rani mukharji");
		kuchkuchhotahaicast2.add("Salman khan");
		kuchkuchhotahaicast2.add("kajol");

		System.out.println(kabhikusshikabhigamcast1);
		System.out.println(kuchkuchhotahaicast2);

		kabhikusshikabhigamcast1.addAll(kuchkuchhotahaicast2);
		System.out.println(kabhikusshikabhigamcast1);
		System.out.println(kuchkuchhotahaicast2);

		kabhikusshikabhigamcast1.containsAll(kuchkuchhotahaicast2);

		kabhikusshikabhigamcast1.removeAll(kuchkuchhotahaicast2);

	}
}
