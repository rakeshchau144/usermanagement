package nd_assignment.Assignment.repository;

import nd_assignment.Assignment.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    List<User> userList = new ArrayList<>();

    public void  addUser(User user){
        userList.add(user);
    }
    public User getUserById(Long userId){
        for(User user:userList){
            if((long)user.getUserId()==userId){
                return user;
            }
        }
        return null;
    }
    public List<User> getAllUsers(){
        return userList;
    }

    public void deleteUser(Long userId){
        for (User user:userList){
            if((long)user.getUserId()==userId){
                userList.remove(user);
            }
        }
    }
}
