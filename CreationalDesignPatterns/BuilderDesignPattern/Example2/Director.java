package BuilderDesignPattern.Example2;

public class Director {

    UserDTOBuilder builder;

    public Director(UserDTOBuilder builder){
        this.builder = builder;
    }

    public UserDTO createUserDTO(User user){

        if(builder instanceof UserWebDTOBuilder){
            return createUserWebDTO(user);
        }
        return null;
    }

    public UserDTO createUserWebDTO(User user){

        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress()).withBirthday(user.getBirthday()).build();



    }
    
}
