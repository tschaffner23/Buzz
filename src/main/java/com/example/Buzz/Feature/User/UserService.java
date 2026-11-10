package com.example.Buzz.Feature.User;

import com.example.Buzz.Feature.User.Model.UserDTO;
import java.util.List;

public interface UserService {

    public List<UserDTO> getAllUsers();
    
    public UserDTO getUserById(Long id);

    public void createUser();

    public void deleteUser();
}
