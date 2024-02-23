package com.muruna.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.muruna.user.model.User;
import com.muruna.user.service.UserService;
import com.muruna.user.util.ErrorResponse;

@Controller
@RequestMapping("/api/users")
public class UserController {

 @Autowired
 private UserService userService;

 @RequestMapping(value = "/register", method = RequestMethod.POST)
 @ResponseBody
 public ResponseEntity<Object> registerUser(@RequestBody User user) {
     try {
         User registeredUser = userService.registerUser(user);
         return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
     } catch (RuntimeException e) {
         return new ResponseEntity<>(new ErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
     }
 }
}
