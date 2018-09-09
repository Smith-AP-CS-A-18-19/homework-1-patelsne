// patelsne
/*
 * Sneha Patel
 */
import javafx.application.Application;
import java.awt.Rectangle;

public class Homework1 {

	/* Fix the error(s) in this method so that it runs properly
	 */
	public static int problem1() {
		int mystery1 = 1;
		int mystery2 = mystery1 + 1;
		int mystery = 1 - 2 * mystery2;
		return mystery;
	}

	/* Construct and return a Rectangle that has a width of w and a
	 * height of h
	 */
	public static Rectangle problem2(int w, int h) {
		Rectangle box = new Rectangle(10,10,w, h);
		return box;

	}

	/* Declare an integer, assign it a value of 5, then return it
	 */
	public static int problem3() {
		int x = 5;
		return x;

	}

	/* Declare and return a String containing the phrase "Computer Science"
	 */
	public static String problem4() {
		String coolclass= "Computer Science";
		return coolclass;

	}

	/* Add 5 to num and return the new value
	 */
	public static int problem5(int num) {
		int answer= num + 5;
		return answer;

	}

}
