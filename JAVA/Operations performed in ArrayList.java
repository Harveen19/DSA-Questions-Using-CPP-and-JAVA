import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//ArrayList<String> list2 = new ArrayList<>();
		//ArrayList<Boolean> list3 = new ArrayList<>();
		
		// add elements
		list.add(0);
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		// get elements
		int element = list.get(0); // 0 is the index
		System.out.println(element);
		
		// add element in between
		list.add(1,3); // 1 is the index and 3 is the element to be added
		System.out.println(list);
		
		// set element
		list.set(0,4);
		System.out.println(list);
		
		// delete element
		list.remove(2); // 2 is the index
		System.out.println(list);
		
		// size
		int size = list.size();
		System.out.println(size);
		
		// loops on lists
		for(int i=0;i<list.size();i++){
		    System.out.print(list.get(i));
		} 
		
		System.out.println();
		
		// sorting the list
		Collections.sort(list);
		System.out.println(list);
	}
}
