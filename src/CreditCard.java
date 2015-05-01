// lesson 6.1 - loops

public class CreditCard {
	private long cardNumber;
	
	/**
	 *  Constructor method
	 * @param cardNumber
	 */
	public CreditCard (long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
    /**
     * Calculates whether this CreditCard has a valid number.
     * @return true if the number is valid, false if it's not.
     */
	public boolean isValid()
	{
		/* Pseudocode for isValid:
         * sum = 0
         * count = 0
         * for each digit starting from the right
         *     count ++
         *     if count is odd
         *         sum = sum + digit
         *     else if (digit < 5)
         *         sum = sum + 2 * digit
         *     else
         *         sum = sum + 2 * digit - 9
         * if the last digit of the sum is zero
         *     The card number is valid
         */
        long n = cardNumber;
        int sum = 0;
    	int count = 0;

        while (n > 0) {
            int digit = (int)(n % 10);
            count ++;
        	
        	if (count % 2 == 1) {
        		sum = sum + digit;
        	} else if (digit < 5) {
        		sum = sum + 2 * digit;
        	} else {
        		sum = sum + 2 * digit - 9;
        	}

            n = n/10;
        }
        
        return sum % 10 == 0;
	}
	
	/**
	 * Sums every second digit, starting with the right-most.
	 * @return
	 */
	public int sumCertainDigits() {
		
		long n = cardNumber;
		int sum = 0;
		
		while (n > 0) {
			int digit = (int)(n % 10);
			sum = sum + digit;
			n = n/100;
		}
		return sum;
	}
}
