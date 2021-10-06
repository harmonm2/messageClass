/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 22 February 2017
 */

// Class description: Creates message format and allows 
// user to build a body of text
public class Message {
	// Variables:
	// recip, sender, body
	private String recip, sender, body;
	private String oneLineBody = "";
	private String result = "";
	private static String FROM = "From: ";
	private static String TO = "To: ";

	// Methods:
	// append method: appends parameter String text to body
	// ensure line break (add \n)
	public void append(String lineText) {
		this.body = this.body + lineText + "\n";
	}

	// toString method: shows the \n's and make one line
	// need 2 static variables "From: " and "\nTo: "
	public String convertMessageToOneLine() {
		this.oneLineBody = body.replace("\n", "\\n");
		result = FROM + sender + "\\n" + TO + recip + "\\n" + oneLineBody;
		result = result.toString();
		return result;
	}

	// Constructor:
	// takes in a sender and recip
	public Message(String sender, String recip) {
		this.recip = recip;
		this.sender = sender;
		body = "";
	}

	// Getters and Setters
	public String getRecip() {
		return recip;
	}

	public void setRecip(String recip) {
		this.recip = recip;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getOneLineBody() {
		return oneLineBody;
	}

	public void setOneLineBody(String oneLineBody) {
		this.oneLineBody = oneLineBody;
	}

	public static String getFROM() {
		return FROM;
	}

	public static void setFROM(String fROM) {
		FROM = fROM;
	}

	public static String getTO() {
		return TO;
	}

	public static void setTO(String tO) {
		TO = tO;
	}
}// End class
