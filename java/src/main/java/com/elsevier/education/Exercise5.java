package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Mark the Singleton as final and construtor as private so that caller can not instantiate.
Caller must use getInstance to get the object.

*/
public class Exercise5 {
	
	public final static class Singleton {
	
		private static Singleton ins = null;
		
		private Singleton() {}
		
		public static synchronized Singleton getInstance() {
			if (ins == null) {
				ins = new Singleton();
			}
			return ins;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
