package language.concurrency;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	protected static void println(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList
		
		println("\nConcurrentModificationException demo");
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		
		println("\nRemoving Apple while iterating");
		Iterator<String> iter = fruits.iterator();
		//fruits.add("Mango");//ERROR: throws ConcurrentModificationException
		while(iter.hasNext()) {
			String fruit = iter.next();
			if(fruit.equals("Apple"))
				iter.remove();
			else
				println(fruit);
		}
		
		//CopyOnWriteArrayList
		
		println("\nCopyOnWriteArrayList demo");
		List<String> safeFruits = new CopyOnWriteArrayList<String>();
		safeFruits.add("Apple");
		safeFruits.add("Banana");
		safeFruits.add("Pineapple");
		
		Iterator<String> iterSafe = safeFruits.iterator();
		safeFruits.add("Mango");
		while(iterSafe.hasNext()) {
			println(iterSafe.next());
		}
		
		println("\nSafely added Mango.");
		iterSafe = safeFruits.iterator();
		while(iterSafe.hasNext()) {
			println(iterSafe.next());
		}
		
		println("\nSafely removing Apple while reading.");
		iterSafe = safeFruits.iterator();
		while(iterSafe.hasNext()) {
			safeFruits.remove("Apple");
			println(iterSafe.next());
		}
		
		println("\nSafely removed Apple.");
		iterSafe = safeFruits.iterator();
		while(iterSafe.hasNext()) {
			println(iterSafe.next());
		}
		
		//functional programming using forEachRemaining()
		println("\nfunctional programming using forEachRemaining()");
		iter = fruits.iterator();
		iter.forEachRemaining(element -> println(element));
	}

}
