// lesson 5.2 - Decisions
// Lesson6 debugger1
public class Word {

    /*lesson5.2
    private String letters;
//    public Word(String letters) 
//    {
//        this.letters = letters.toLowerCase();
//    }
    */
	/*lesson 6.2*/
    private String text;

    /**
       Constructs a word by removing leading and trailing non-
       letter characters, such as punctuation marks.
       @param s the input string
    */
    public Word(String s)
    {
        // YOUR CODE SOMEWHERE NEAR HERE
        // The constructor currently cuts off the last letter 
        // of the word. How would you fix that? 
        // Hint: In the video you saw that i and j were calculated correctly. 
        text = s.toLowerCase();
        int i = 0;

        while (i < s.length() && !Character.isLetter(s.charAt(i)))
        {
            i++;
        }
        int j = s.length() - 1;
        while (j > i && !Character.isLetter(s.charAt(j)))
        {
            j--;
        }
        text = s.substring(i, j+1);
    }

    /**
       Returns the text of the word, after removal of the
       leading and trailing non-letter characters.
       @return the text of the word
    */
    public String getText()
    {
        return text;
    }

    /**
       Counts the syllables in the word.
       @return the syllable count
    */
    public int countSyllables()
    {
        int count = 0;
        int end = text.length() - 1;
        if (end < 0)
        {
            return 0;    // The empty string has no syllables
        }

        // An e at the end of the word doesn't count as a vowel
        if (text.endsWith("e"))
        {
            end--;
        }

        boolean insideVowelGroup = false;
        for (int i = 0; i <= end; i++)
        {
            String letter = text.substring(i, i + 1);
            if ("aeiou".contains(letter.toLowerCase()))
            {
                // letter is a vowel
                if (!insideVowelGroup)
                {
                    // Start of new vowel group
                    count++;
                    insideVowelGroup = true;
                }
            }
            else insideVowelGroup = false;
        }

        // Every word has at least one syllable
        if (count == 0)
        {
            count = 1;
        }

        return count;
    }
    // If the word ends in y preceded by a consonant you take away the y and add ies.
    // If the word ends in y preceded by a vowel, you just add an s.
    // You add an es when a word ends in o, or s, or sh, or ch.
    // In all the other case just add an s.
   /* public String getPluralForm()
    {
		int last = letters.length() - 1; // Index of the last letter.
    	if (is(last, "o") || is(last, "s")) {
			return letters + "es";
		}
		else if (is(last, "h")
				&& (is(last - 1, "s") || is(last - 1, "c"))) {
			return letters + "es";
		}
		else if (is(letters.length() - 1, "y")){
			if (isVowel(last - 1)) {
				return letters + "s";
			}
			else {
				return letters.substring(0, last) + "ies";
			}
		}
        else {
            return letters + "s";
        }

    }
    */
    
    /** Is the ith letter a vowel? */
    public boolean isVowel(int i)
    {
        return is(i, "a")
               || is(i, "e")
               || is(i, "i")
               || is(i, "o")
               || is(i, "u");
    }
    
    /** Is the ith letter a consonant? */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }
    
    public boolean is(int i, String letter)
    {
        return letters.substring(i, i + 1).equals(letter);
    }
}
