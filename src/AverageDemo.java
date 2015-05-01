// lesson 6.2 loops > Average

import java.util.Scanner;
public class AverageDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        double num;
        int count = 0;
        double sum = 0;

        // TODO: Collect values from the user until they enter a 0.
        // Track the sum of all the inputs so you can calculate the
        // average at the end
        do {
            System.out.print("Enter a value, 0 to quit: ");
            num = in.nextDouble();
            if (num != 0) {
            	sum = sum + num;
            	count++;
            }
        } while (num != 0);
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
	}

}
