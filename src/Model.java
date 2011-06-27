
public class Model {

	private String message;

	public Model(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String greet(String name) {
		return "Hello " + name + ", " + getMessage();
	}
	
}
