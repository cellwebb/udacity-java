// lesson 6.1 - Loops - Twitter Posts Backwards

public class TwitterizerTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Twitterizer twitterizer = new Twitterizer();
		String longPost = "How did I ever program without loops?!";
		
		System.out.println("Actual: " + twitterizer.shorten(longPost));
		System.out.println("Expected: Hw dd  vr prgrm wtht lps?!");
		
		System.out.println("Actual " + twitterizer.reverse(longPost));
		System.out.println("Expected: !?spool tuohtiw margorp reve I did woH");

	}

}
