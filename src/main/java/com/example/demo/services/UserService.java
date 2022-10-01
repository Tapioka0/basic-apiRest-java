package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserModel GetUsersByID(Long id){
       return  userRepository.findById(id).orElse(null);

    }

    public ArrayList<UserModel> GetUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();

    }
    public UserModel UpdateDateForUser(Long id, UserModel newUser){
        UserModel user =  userRepository.findById(id).orElse(null);
        if(user != null){
            user.setEdad(newUser.getEdad());
            user.setGEB(newUser.getGEB());
            user.setEstatura(newUser.getEstatura());
            user.setPeso(newUser.getPeso());

            return userRepository.save(user);
        }
        else return null;




    }
    public  UserModel SaveUser(UserModel users){
        return userRepository.save(users);

    }
}
