// lesson 6.1 - Loops - Only Consonants

public class Twitterizer {
    /**
     * Shortens and returns long posts by removing vowels
     * @param longPost the post whos vowels need to be removed
     * @return a version of the post without vowels
     */
    public String shorten(String longPost) {
        String shortPost = "";
        for (int i = 0; i < longPost.length(); i++)
        {
            if (!"aeiouAEIOU".contains(longPost.substring(i, i+1)))
            {
                shortPost = shortPost + longPost.substring(i, i+1);
            }
        }
        return shortPost;
    }
    
    /**
     * Prints a post backwards to hide its contents.
     * @param post the post to be reversed.
     */
    public String reverse(String post) {
    	String reversePost = "";
    	for (int i = post.length()-1; i >= 0; i--) {
    		//System.out.println("i: " + i + " " + post.substring(i, i + 1));
    		reversePost = reversePost + post.substring(i, i + 1);
    	}
    	return reversePost;
    }
}
