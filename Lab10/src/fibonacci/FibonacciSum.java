package fibonacci;

import java.util.LinkedList;
import java.util.Queue;

public class FibonacciSum {
	public long sumOfOddValueTerms() {
		Queue<Integer> q = new LinkedList<Integer>();
		long sum = 0;
		q.add(0);
		for (int i = 1; i < 2000000000; i = (q.poll() + q.peek())) {
			q.add(i);
			if (i % 2 != 0) {	//If i is odd
				sum = sum + i;
			}
		}

		return sum;
	}
}
