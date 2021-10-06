/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 22 February 2017
 */

// Class description: Tests the Message class
public class MessageTester {
	public static void main(String[] args) {
		// Steps:
		// construct one or more objects 
		// invoke methods
		// print out results
		// print expected results
		
		Message m = new Message("Morgan", "Grandma");
		
		m.append("Hello, Grams!");
		m.append("How are you?");
		System.out.print(m.convertMessageToOneLine());
		// Result: From: Morgan\nTo: Grandma\nHello, Grams!\nHow are you?\n
		// Expected are same
	}// End main
}// End class
