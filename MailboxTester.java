/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 22 February 2017
 */

// Class description: Tests the Mailbox class

public class MailboxTester {
	public static void main(String[] args) {
		// Steps:
		// construct one or more objects
		// invoke methods
		// print out results
		// print expected results

		Message a = new Message("a", "b");
		Message c = new Message("c", "d");
		Message e = new Message("e", "f");
		Message g = new Message("g", "h");
		
		Mailbox mail = new Mailbox("My Mailbox");
		
		mail.addMessage(a);
		mail.addMessage(c);
		mail.addMessage(e);
		mail.addMessage(g);
		
		mail.removeMessage(2);
		
		mail.getMessage(2);
		
		System.out.println((mail.getMessage(0)).convertMessageToOneLine());
		// Prints: From: a\nTo: b\n
		// Prints expected result
	} // End main
} // End class
