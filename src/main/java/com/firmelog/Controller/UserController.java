package com.firmelog.Controller;

import com.firmelog.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firmelog.Models.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

     @RequestMapping("/create")
     public String create(@RequestParam String username, @RequestParam String email, @RequestParam String password){
         User u = userService.create(username, email, password);
         return u.toString();
     }

     @RequestMapping(value = "/get", method = RequestMethod.GET)
     public User getUser(@RequestParam String username) {
         return userService.getByUsername(username);
     }

     @RequestMapping(value = "/getAll", method = RequestMethod.GET)
     public List<User> getAll(){
         return userService.getAll();
     }

     @RequestMapping("/update")
     public String update(@RequestParam String username, @RequestParam String password) {
         User u = userService.update(username, password);
         return u.toString();
     }

     @RequestMapping("/delete")
     public String delete(@RequestParam String username) {
         userService.delete(username);
         return "Deleted"+username;
     }

     @RequestMapping("/deleteAll")
     public String deleteAll() {
         userService.deleteAll();
         return "Deleted all records";
     }
}