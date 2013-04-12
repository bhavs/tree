package queue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {

	/**
	 * @param args
	 */
	TreeMap<Key, String> sample = new TreeMap<Key,String>(/* new keyComparator()*/);
	public static void main(String[] args) {
		TreeMapExample ex = new TreeMapExample();
		ex.sample.put( (ex.new Key(1)),"first");
		ex.sample.put(ex.new Key(2), "second");
		ex.sample.put(ex.new Key(3), "third");
		Iterator<Key> iter = ex.sample.keySet().iterator();
		while(iter.hasNext()){
			Key i= iter.next();
			System.out.println(" "+i.getInterger1()+" "+ex.sample.get(i));
		} 
		ex.sample.put(ex.new Key(4), "fourth");
		ex.sample.put(ex.new Key(5), "fifth");
		iter = ex.sample.keySet().iterator();
		while(iter.hasNext()){
			Key i= iter.next();
			System.out.println(" "+i.getInterger1()+" "+ex.sample.get(i));
		} 
		
		System.out.println(" "+ex.sample.pollFirstEntry().getValue());
//		sample.remove(sample.firstEntry().getKey());
		iter = ex.sample.keySet().iterator();
		while(iter.hasNext()){
			Key i= iter.next();
			System.out.println(" "+i.getInterger1()+" "+ex.sample.get(i));
		} 
	}
	private class Key implements Comparable<Key>{
		private int interger1;
		
		public Key( int i){
			interger1=i;
		}

		public int getInterger1() {
			return interger1;
		}

		public void setInterger1(int interger1) {
			this.interger1 = interger1;
		}

		@Override
		public int compareTo(Key o) {
		
			return  (this.getInterger1()-o.getInterger1() >0 ?1:0);
		}
		
	}
	
//	private class keyComparator implements Comparator<Key>{
//
//		@Override
//		public int compare(Key o1, Key o2) {
//		
//			return (o1.getInterger1()-o2.getInterger1() >0 ?1:0);
//		}
//		
//	}
	

		
		
	

}
