

public class Example01{
	
	ArrayList<Integer>List=new ArrayList<>(); 	

	list.add(11);
	list.add(11);
	list.add(11);
	list.add(11);
	list.add(11);

	System.out.println(list);

	for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));

	for(Integer num:List)
		System.out.println(num);

	System.out.println("isEmpty "+list.isEmpty());

	System.out.println(list.contains(11));

	System.out.println(list.remove(Integer.valueOf(11)));

	
}