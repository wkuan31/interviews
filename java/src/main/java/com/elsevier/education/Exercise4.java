package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

No. the count is not thread-safe because it can be accessed by multiple callers in methods, increment and resetCount.

Fix: make methods, increment and resetCount as synchronized
or make synchronized block for count. such as
synchronized (count) {
...
}

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public synchronized void resetCount() {
			count = 0;
		}

	}
}