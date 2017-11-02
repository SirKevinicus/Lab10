package palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FourDigitChecker {

	public int largestFourDigitPalindrome() {
		int largestPNum = 1001;
		for (int i = 1000; i <= 9999; i++) {
			for (int j = 1000; j <= 9999; j++) {
				int product = i*j;
				if(isPalindrome(product) && product > largestPNum) {
					largestPNum = product;
				}
			}
		}
		return largestPNum;
	}

	public Boolean isPalindrome(int x) {
		String num = x + "";
		Queue<Character> q = new LinkedList<Character>();
		Stack<Character> s = new Stack<Character>();
		int count = 0;
		
		while(count < num.length()) {
			q.add(num.charAt(count));
			s.push(num.charAt(count));
			count++;
		}
		
		while(!q.isEmpty()) {
			if(q.poll() != s.pop())
				return false;
		}
		return true;
		
	}
}
