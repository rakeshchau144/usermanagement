package nd_assignment.Assignment.userService;

import nd_assignment.Assignment.model.User;
import nd_assignment.Assignment.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public void addUser(User user){
        userRepo.addUser(user);
    }
    public User getUserById(Long userId){
        return userRepo.getUserById(userId);
    }
    public List<User> getAllUsers(){
        return userRepo.getAllUsers();
    }
    public  String updateUser(Long userId, User user){
        User user1 = userRepo.getUserById(userId);
        user1.setUserName(user.getUserName());
        user1.setName(user.getName());
        user1.setAddress(user.getAddress());
        user1.setNumber(user.getNumber());
        return "user update successfully ";
    }

    public String deleteUser(Long userId){
        userRepo.deleteUser(userId);
        return "User deleted Successfully .";
    }
}
