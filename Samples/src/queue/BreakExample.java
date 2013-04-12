package queue;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakExample {
	
	public static void main(String[] args){
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		if( someCondition()==true){
			System.out.println(" condition true");
		} else {
			int tempFlag=0;
			Iterator<Integer> iter = ints.iterator();
			while(iter.hasNext()){
				Integer temp = iter.next();
				if( temp==3){
					tempFlag=1;
					break;
				}
			}
			if( tempFlag==0)
			ints.add(3);
			
		}
		Iterator<Integer> iter = ints.iterator();
		while(iter.hasNext()){
			Integer temp = iter.next();
			System.out.println(" "+temp);
		}
		
		
	}

	private static boolean someCondition() {
		// TODO Auto-generated method stub
		return false;
	}

}
