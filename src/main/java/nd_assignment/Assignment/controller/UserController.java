package nd_assignment.Assignment.controller;

import nd_assignment.Assignment.model.User;
import nd_assignment.Assignment.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "User Insert successful";
    }

    @GetMapping("/getUser/{userId}")
    public String getUser(@PathVariable Long userId){
        System.out.println("Hello world");
        User userById = userService.getUserById(userId);
        if(userById == null){
            return "Not Exist in present Database";
        }
        return userById.toString();
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @PutMapping("/updateUserInfo/{userId}")
    public String updateUserInfo(@PathVariable Long userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable Long userId){
        return userService.deleteUser(userId);
    }
}
