// Bluej project: finding_the_first_match
// Write a program that finds the first word in Alice In Wonderland
// that is longer than a given number of characters.

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FirstMatch
{
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;
        int count = -1;
        final int THRESHOLD = 9;
        // TODO: Write a loop that searches for long words
        // (more than THRESHOLD letters)
        // The loop should stop if you find one or if you run out of words
        do {
        	String word = in.next();
        	if (word.length() > THRESHOLD) {
        		found = true;
        		longWord = word;
        	}
    		count++;
        } while(in.hasNext() && !found);
        
        if (found) {
        	System.out.println("The first long word is: " + longWord + " at position " + count);
        } else {
        	System.out.println("There are no long words");
        }
    }
}
