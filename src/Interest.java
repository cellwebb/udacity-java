// lesson 6.1 - Loops
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	        double balance = 100;
	        int year = 0;
	        int target = 1000000000;
	        double rate = 0.1;

	        while (balance < target)
	        {
	            double interest = balance * rate;
	            balance = balance + interest;
	            year++;
	        }
	        System.out.println("It will take " + year + " years.");
	    }

}
