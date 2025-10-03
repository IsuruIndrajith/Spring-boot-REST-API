package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers(){
        List<User>userList = userRepo.findAll();   //1) UserRepo eka pavichchi krala findAll gnnva. Eeka User(Model) type eke list ekak
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());  // 2) Model mapper eken eeka DTO type ekata hravanava. usert pennanne DTO type nisa
//[new TypeToken<List<UserDTO>>(){}.getType()] <-- this gives the generic type of DTO at the current runtime
    }

}
