package com.example.Buzz.Feature.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Buzz.Feature.User.Model.UserDTO;
import com.example.Buzz.Feature.User.Model.User;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser() {

    }

    public void deleteUser() {
        
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
        .map(u -> new UserDTO(u.getId(), u.getFirstName(), u.getLastName(), u.getUserName()))
        .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        UserDTO userDTO = null;
        Optional<User> userRecord = userRepository.findById(id);

        if(userRecord.isPresent()) {
            User user = userRecord.get();
            userDTO = new UserDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getUserName());
        }
        return userDTO;
    }
}
