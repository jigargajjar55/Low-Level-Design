package SOLID.SingleResponsibilityPrinciple.Example;

import java.io.IOException;


//import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private UserPersistenceService persistenceService = new UserPersistenceService();
	
    
    //Create a new user
    public String createUser(User newUser) throws IOException {
        //ObjectMapper mapper = new ObjectMapper();
        User user = newUser;

        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.validator(user);    
        

        if(!isValid) {
            return "ERROR";
        }

        persistenceService.saveUser(user);

        return "SUCCESS";
    } 

    

}