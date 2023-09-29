package pack;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("nandu");
		al.add("praisy");
		al.add("sreehari");
		al.add("ann");
		al.add("java");
		System.out.println("ArrayList is :" +al);
		 
		//get
		String element=al.get(3);
		System.out.println(element);
		
		//contains
		boolean element_f=al.contains("java");
		System.out.println(element_f);
		
		//size
		int s=al.size();
		System.out.println(s);
		
		//remove
		al.remove(2);
		System.out.println(al);
		
		//for-each,iterator
		//hasNext():it returns true if there are more elements.
		//next():it returns element
		
		//Iterator
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){//true
			String str=itr.next();
			System.out.println(str);
		}
		//for-each/Enhanced for loop
		for(String i:al) {
			System.out.println("Elements using for-each" +i);
		}
		
		//array
		int a[]= {3,4,5,6,5};
		for(int i:a) {
			System.out.println(i);
		}
		}
	
		

	}


