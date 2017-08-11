import java.io.IOException;

public class CheckAndMakePalindromeNumber {

	public static void main(String[] args) throws IOException {
		int input1 = 222111122;
		boolean isPalindrome = checkPalindrome(input1);
		if (isPalindrome) {
			System.out.println("The input is Palindrome");
		} else {
			System.out.println("Checking if Palindrome is possible");
			boolean isPalindromePossible = checkifPalindromePossible(input1);
			if (!isPalindromePossible) {
				System.out.println("Palindrome number not possible");
			}
		}
	}
	private static boolean checkifPalindromePossible(int number) {
		int digitsCount[] = new int[10];
		int remainder = 0, numberOfDigitsWithOddCount = 0, inputLength = 0;
		while (number > 0) {
			remainder = number % 10;
			digitsCount[remainder]++;
			number /= 10;
			inputLength++;
		}
		// for (int i = 0; i < 10; i++) {
		for (int i : digitsCount) {
			if (i % 2 == 1)
				numberOfDigitsWithOddCount++;
		}
		if (numberOfDigitsWithOddCount > 1)
			return false;
		else {
			char[] characterArray = new char[inputLength];
			int charPlace = 0;
			for (int i = 0; i < 10; i++) {
				while (digitsCount[i] > 0) {
					if (digitsCount[i] % 2 == 0 && digitsCount[i] > 0) {
						characterArray[charPlace] = (char) ('0' + i);
						characterArray[inputLength - charPlace - 1] = (char) ('0' + i);
						charPlace++;
						digitsCount[i] -= 2;
					} else if (digitsCount[i] % 2 == 1) {
						characterArray[inputLength / 2] = (char) ('0' + i);
						digitsCount[i]--;
					}
				}
			}
			System.out.println(String.valueOf(characterArray));
			return true;
		}
	}

	private static boolean checkPalindrome(int input1) {
		int temp = input1, rem = 0, temp2 = 0;
		while (temp != 0) {
			rem = temp % 10;
			temp2 = temp2 * 10 + rem;
			temp /= 10;
		}
		return input1 == temp2;
	}

}