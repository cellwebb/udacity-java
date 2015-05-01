// lesson 6.1 - loops
public class CreditCardTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard card = new CreditCard(12345);
		System.out.println("Actual: " + card.sumCertainDigits());
		System.out.println("Expected: 9");

		CreditCard anotherCard = new CreditCard(135792);
		System.out.println("Actual: " + card.sumCertainDigits());
		System.out.println("Expected: 12");
	}

}
