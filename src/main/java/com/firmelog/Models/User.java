package com.firmelog.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

//    @Id
//    public ObjectId _id;
    public String username;
    public String email;
    public String password;

    public User(String username, String email, String password) {
//        this._id = _id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

//    public String get_id() {
//        return _id.toHexString();
//    }

//    public void set_id(ObjectId _id) {
//        this._id = _id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  String toString(){
        return "User :"+username+" "+email;
    }
}
