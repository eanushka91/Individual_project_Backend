package edu.icet.controller;

import edu.icet.dto.User;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController{

    private final UserService service;

    @PostMapping("/login")
    public ResponseEntity<User> getUserDetails(@RequestBody User user) {
        User userlogin = service.userLogin(user.getUsername(), user.getPassword());
        if(userlogin != null){
            return new ResponseEntity<>(userlogin, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
