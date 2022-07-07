package tn.eniso.chat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.eniso.chat.model.User;
import tn.eniso.chat.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User createUser(User user){
        userRepository.save(user);
        return user;
    }

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }
}
