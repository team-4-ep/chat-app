package tn.eniso.chat.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.eniso.chat.model.User;
import tn.eniso.chat.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    public UserService userService;


    UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping(path = "/list", name = "get_user")
    public ResponseEntity<Iterable> getList(){

        Iterable<User> user  = this.userService.getUsers();
        return  new ResponseEntity<>(user,HttpStatus.OK);
    }
    @PostMapping(path = "/")
    public User createUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

}
