package BuilderDesignPattern.Example2;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {

		User user = createUser();

		Director directorObj = new Director(new UserWebDTOBuilder());

		UserDTO userDTOObj = directorObj.createUserDTO(user);

		System.out.println("User Name: " + userDTOObj.getName());
		System.out.println("User Address: "+userDTOObj.getAddress());
		System.out.println("User Age: " + userDTOObj.getAge());
		
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
