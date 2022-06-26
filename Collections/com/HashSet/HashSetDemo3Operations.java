package com.HashSet;

import java.util.HashSet;

public class HashSetDemo3Operations {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
			set1.add(1);
			set1.add(2);
			set1.add(3);
			set1.add(4);
			set1.add(5);
	        System.out.println("HashSet1: " + set1);

	        HashSet<Integer> set2 = new HashSet<Integer>();
	        set2.add(3);
			set2.add(4);
			set2.add(5);
	        System.out.println("HashSet2: " + set2);
		
	/*	//Union  ---> collect all the elements from the set1 and set2 and only stores unique elements
	       // set1.addAll(set2);
	      //  System.out.println("Union is: " + set1); //[1, 2, 3, 4, 5] // Duplicates not allowed
	    
	     //Intersection  -->only common elements
	       set2.retainAll(set1);   //--> // operation is done and it will be stored into the set2.
	        System.out.println("Intersection is: " + set2); //[3, 4, 5] 
	    
	    //Difference
	        set1.removeAll(set2);  //--> // operation is done and it will be stored into the set1.
	        System.out.println("Difference is: " + set1); //[1, 2]
*/	    
	    //subset
	        set1.containsAll(set2);   // all the elements of set2 must be present in
	        System.out.println("subset: " + set1); //[1, 2]    --> operation done on the 
	      boolean hi =   set1.containsAll(set2); // set 2 is a part of set then it is true
	      System.out.println("result " + hi);
	}

}