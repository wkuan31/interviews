package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 The issue is the hashCode is key for HashSet. When you add same object twice, the first is overwritten by second. The method 'equals' has to be modified to save same hasCodes of Persons for different objects. For exmple. equals always return false.

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			//return id.equals(((Person)other).id);
			return false;
		}
	}
}