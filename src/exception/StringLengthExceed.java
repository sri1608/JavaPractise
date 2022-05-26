package exception;

public class StringLengthExceed  extends Exception{
//if any string length is more than 10 this exception will occur

	private String message;

	public StringLengthExceed(String message) {
		this.message = message;
	}

	public String toString() {
		return "StringLengthExceed [message=" + message + "]";
	}
	

	}


