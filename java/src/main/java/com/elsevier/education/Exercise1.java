package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
Mark this class as final and all variables as final.
Use Construtor to set values for all variables.
Remove setters

*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
		}

		public Person(String fn, String ln, Set<String> phones) {
			firstName = fn;
			lastName = ln;
			phoneNumbers = phones;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}