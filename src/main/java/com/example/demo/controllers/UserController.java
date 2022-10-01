package com.example.demo.controllers;


import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/nutrinet/cliente")
public class UserController {

    @Autowired
    UserService userService;


    // get Users
    @GetMapping
    @ResponseBody
    public Object getUsers(@RequestParam @Validated Optional<Long> id){
        // check id is existed
        Long Id = id.orElse(null);
       if(Id != null) {
          Object user =  userService.GetUsersByID(Id);
          // check user exist
          if(user == null) {
              System.out.println("getUsers (GET) Error: Cve_Error: entity not found, path: api/v1/nutrinet/cliente");
              throw new ResponseStatusException(
                      HttpStatus.NOT_FOUND, "Cve_Error: entity not found"
              );
          }
           else {
              System.out.println("getUsers (GET) 200: Cve_Error: entity found");
              return user;
          }
       }
       else  {
           System.out.println("getUsers (GET) 200: Cve_Error: send All Users");
           return (ArrayList<UserModel>) userService.GetUsers();
       }
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        try {
            System.out.println("saveUsers (POST) 200: Creating.... new User, path: api/v1/nutrinet/cliente");
    return userService.SaveUser(user);
        } catch(Exception e) {
            System.out.println("saveUsers (POST) 400: Cve_Error: Duplicate entry, path: api/v1/nutrinet/cliente");
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Cve_Error: Duplicate entry"
            );

        }
    }


    @PutMapping
    @ResponseBody
    public Object updateUsers(@RequestParam @Validated Long id, @RequestBody UserModel newUser){
       try {
           UserModel user = userService.UpdateDateForUser(id, newUser);
           if (user == null) {
               System.out.println("updateUsers (PUT) 404: Cve_Error: User not found, path: api/v1/nutrinet/cliente");
               throw new ResponseStatusException(
                       HttpStatus.NOT_FOUND, "Cve_Error: User not found"
               );
           } else return user;
       } catch (Exception e){
           System.out.println(e);
           throw new ResponseStatusException(
                   HttpStatus.BAD_REQUEST, "Cve_Error: Error"
           );
       }


    }


}
