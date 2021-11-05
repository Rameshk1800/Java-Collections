package javaCollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListCollections {
	
	

	public static void main(String[] args) {
		
		
		List<String> arrayList= new ArrayList<String>();
		
		
		//We can add list and we can add duplicate list also.
		arrayList.add("Audi");
		arrayList.add("BMW");
		arrayList.add("Ford");
		arrayList.add("Benz");
		arrayList.add("Ford");
		
		System.out.println(arrayList);
		
		//We can delete list by remove by index and by the element name.
		arrayList.remove(0);
		arrayList.remove("BMW");
		System.out.println(arrayList);
		
		
		//We can transfer one list to another list
		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		
		System.out.println("-------------------------------------------------");
		
		
		//we can Rename the list by set()
		anotherList.set(0, "Fzs");
		System.out.println(anotherList);
		
		System.out.println("-------------------------------------------------");
		
		//We can Add Null item also
		anotherList.add(null);
		System.out.println(anotherList);
		
		System.out.println("-------------------------------------------------");
		
	    //If the index is not present there we get OutOfBoundException:
		
		//Tocheck list is empty or not
		System.out.println(anotherList.isEmpty());
		
		
		System.out.println("-------------------------------------------------");
		
		//getAll element using For Loop:
		
		for(int i=0;i<anotherList.size();i++) {
			System.out.println(anotherList.get(i));
		}
		
		System.out.println("-------------------------------------------------");
		
		
		//using ForEach Loop
		
		for (String string : anotherList) {
			System.out.println(string);	
		}
		
		System.out.println("-------------------------------------------------2");
		
		
		//Using ListIterator: we can forward and reverse throug LIST ITERATOR
		
		ListIterator<String>iterator = anotherList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------------------------------3");
		
		//Reverse ListIterator:
		
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		
		System.out.println("-------------USING ITERATOR------------------------------------");
		
		//using Iterator: in this we can't reverse.
		Iterator<String>iterator1 = anotherList.iterator();
		while(iterator1.hasNext()){	
		System.out.println(iterator1.next());
		}
		
		System.out.println("-------------USING COPY ON WRITE ARRAY LIST- ADDING LIST WHILE ITERATING------------------------------------");
		
		//To Copy the List While reading:
		
		CopyOnWriteArrayList<String>array = new CopyOnWriteArrayList<String>();
		array.add("Ramesh");
		array.add("Chaco");
		array.add("Vasanth");
		array.add("Nivas");
		
		Iterator< String> iterator2 = array.iterator();
		while(iterator2.hasNext()) {
			array.add("abdul");
			System.out.println(iterator2.next());
			
		}
		
	}

}
