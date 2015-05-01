import java.util.*;

public class SyllableCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter words separated by spaces");
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			Word word = new Word(in.next());
			int syllables = word.countSyllables();
			System.out.println(word.getText());
			System.out.println(syllables);
			
		}
	}

}
