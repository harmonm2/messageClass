import java.util.ArrayList;

/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 22 February 2017
 */

// Class description: Creates a mailbox for Message class
public class Mailbox {
	// Variables:
	// need an string array to store messages
	private ArrayList<Message> mail;
	private final String sig;

	// Methods:

	public void addMessage(Message m) {
		mail.add(m);
	}

	public Message getMessage(int i) {
		
		return mail.get(i);
	}

	public void removeMessage(int i) {
		mail.remove(i);
	}

	// Constructor:
	// Creates an empty mailbox
	public Mailbox(String sig) {
		this.sig = sig;
		mail = new ArrayList<Message>();
	}
} // End class
