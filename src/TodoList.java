// lesson 6.1 - loops
// Video: A More Complicated To Do List

// Actually, Elizas todo list should look like this:
// 1. Eat
// 2. Sleep
// 3. Eat
// 4. Sleep
// 5. Eat
// 6. Sleep
// TODO: Change the code inside the for loop to print out this todo list
public class TodoList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       for (int counter = 1; counter <= 6; counter++)
	       {
	    	   if (counter % 2 == 0) {
	    		   System.out.println(counter + ". Sleep");
	    	   }
	    	   else {
	    		   System.out.println(counter + ". Eat");
	    	   }
	       }
	}

}
