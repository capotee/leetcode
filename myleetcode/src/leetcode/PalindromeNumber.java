package leetcode;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		String swap = x + "";
		int count = swap.length() / 2;
		if (swap.length() % 2 != 0) {
			swap = swap.substring(0, count)
					+ swap.substring(count + 1, swap.length());
		}
		boolean flag = true;
		for (int i = 0; i < count; i++) {
			if (swap.charAt(i) != swap.charAt(swap.length() - 1 - i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(122241));
	}
}
