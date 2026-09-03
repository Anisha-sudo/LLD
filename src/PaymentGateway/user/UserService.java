package PaymentGateway.user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> userList =new ArrayList<>();


    public void addUser(UserDTO userDTO){
     User user =new User();
     user.setEmail(userDTO.getEmail());
     user.setName(userDTO.getName());
     user.setPhone(userDTO.getPhone());
     user.setUserId(userDTO.getUserId());
     userList.add(user);
    }

    public UserDTO getUser(int userId){
        for(User user:userList){
            if(user.getUserId()==userId){
                return convertUserToDTO(user);
            }
        }
        return null;
    }

    public UserDTO convertUserToDTO(User user){
        UserDTO userDTO=new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setPhone(user.getPhone());
        userDTO.setUserId(user.getUserId());
        return userDTO;
    }
}
