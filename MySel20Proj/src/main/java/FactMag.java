class FactMag {
	public static void main(String args[]) {
		/**
		 * Factorize multiples of 5 5 = 5x1 10 = 5x2 15 = 5x3 20 = 5x2x2 ... 25
		 * = 5x5 (one extra 5) .. 50 = 5x5x2 (one extra 5) ... 75 = 5x5x3 (one
		 * extra 5) .. 100 = 5x5x4 (one extra 5) All of the 20 multiples of 5 up
		 * to 100 have one 5 each. The multiples 25,50,75 & 100 have one extra 5
		 * each. Hence the total number of 5s = 24. Each of these twenty four 5s
		 * when multiplied by 2(which are at least 50 in number) yields a zero
		 * and hence the total number of 0s = 24.
		 */
		int n = 100;
		int count = 0;
		for (int powerOfFive = 5; n / powerOfFive > 0; powerOfFive *= 5) {
			count += n / powerOfFive;
		}
		System.out.println(count);
	}
}