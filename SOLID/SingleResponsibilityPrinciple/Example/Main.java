package SOLID.SingleResponsibilityPrinciple.Example;

import java.io.IOException;
import java.util.*;



//Main class to test
public class Main {
	//A valid USER JSON String
//	private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";
	//Invalid USER JSON String - email format wrong
//	private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";
	
	static User user1 = new User("Randy", "randy@email.com", "110 Sugar lane");
	static User user2 = new User("Sam", "sam@email", "111 Sugar lane");

	
	
	public static void main(String[] args) throws IOException {
		UserController controller = new UserController();
		//Check with valid JSON
		String response = controller.createUser(user1);	
		if(!response.equalsIgnoreCase("SUCCESS")) {
			System.err.println("Failed");
		}
		System.out.println("Valid JSON received response: "+response);
		//Check with invalid JSON
		response = controller.createUser(user2);
		if(!response.equalsIgnoreCase("ERROR")) {
			System.err.println("Failed");
		}
		System.out.println("Invalid JSON received response: "+response);
	}

}
