package queue;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
	
	public static void main(String[] args){
		HashMap<Integer, String> hello = new HashMap<Integer, String>();
		hello.put(1, "hello");
//		System.out.println(" "+hello.get(1));
        hello.put(2, "world");
//        System.out.println(" "+hello.get(1));
        hello.put(3, "hello1");
        hello.put(4, "hello2");
        
        Iterator<Integer> iter = hello.keySet().iterator();
        while(iter.hasNext()){
        	Integer temp = iter.next();
        	if( temp == 3){
        		iter.remove();
        	}
        }
        
        Iterator<Integer> iter2 = hello.keySet().iterator();
        while(iter2.hasNext()){
        	Integer temp = iter2.next();
        	System.out.println(" "+temp+" "+hello.get(temp));
        }
	}

}
