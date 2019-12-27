/**
 * 
 */
package com.CodeEZ.spring.Userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CodeEZ.spring.Userservice.model.User;
import com.CodeEZ.spring.Userservice.repository.UserRepository;

/**
 * @author muralidharan.v
 *
 */

@RestController
public class UserController {
		
		@Autowired
		private UserRepository userRepository;
		
		@RequestMapping(path = {"hello","greeting"}, method = {RequestMethod.GET})
		public String hello() {
			return "Hello Wolrd";
		}
		
		@RequestMapping(path="user",method = RequestMethod.POST)
		public ResponseEntity<User> addUser(@RequestBody User user) {
			User createdUser = userRepository.save(user);
			return new ResponseEntity<>(createdUser.HttpStatus.CREATED);
			
			
		}
}
