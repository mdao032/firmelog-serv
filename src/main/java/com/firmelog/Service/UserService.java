package com.firmelog.Service;

import com.firmelog.Repositories.UserRepository;
import com.firmelog.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Create operation
    public User create(String username, String email, String password) {
        return userRepository.save(new User(username, email, password));
    }

    //Get operation
    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    //update operation
    public User update(String username, String password) {
        User p = userRepository.findByUsername(username);
        p.setPassword(password);
        return userRepository.save(p);
    }

    //Delete operation
    public void delete(String username) {
        User u = userRepository.findByUsername(username);
        userRepository.delete(u);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }
}