package PaymentGateway.user;

public class UserController {
    UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    public void addUser(UserDTO userDTO){
       userService.addUser(userDTO);
    }

    public UserDTO getUser(int userId){
        return userService.getUser(userId);
    }

}
