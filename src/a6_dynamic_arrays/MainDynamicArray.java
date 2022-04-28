package a6_dynamic_arrays;

import java.util.*;

public class MainDynamicArray {

	public static void main(String[] args) {
		
		//ArrayList<String> arrayList = new ArrayList<String>();

		DynamicArray dynamicArray = new DynamicArray(5);
		
		//System.out.println(dynamicArray.capacity);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");		
		
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		
		//dynamicArray.insert(0, "X");
		//dynamicArray.delete("A");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray.toString());
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
			
	}

}
