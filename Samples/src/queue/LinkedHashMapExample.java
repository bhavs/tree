package queue;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	static enum weekday {
		sunday, monday
	}
	public static void main(String[] args){
		LinkedHashMap<Integer, String> example = new LinkedHashMap<Integer, String>();
		example.put(1, "one");
		example.put(2, "two");
		
		example.put(3, "three");
		Iterator<Integer> iter=example.keySet().iterator();
		while(iter.hasNext()){
			System.out.println("key"+iter.next());
		} 
//		int len=example.size();
		int key=2;
		Integer last = new LinkedList<Integer>(example.keySet()).getLast();
		System.out.println(" "+last+" "+example.get(last)+" "+weekday.sunday.ordinal());
		example.remove((Object)key);
		example.put(2,"modified two");
		iter=example.keySet().iterator();
		while(iter.hasNext()){
			int temp=iter.next();
			System.out.println("key"+temp+"val"+example.get(temp));
		} 
	}

}
