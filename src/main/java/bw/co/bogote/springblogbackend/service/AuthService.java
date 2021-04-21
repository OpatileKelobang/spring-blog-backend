package bw.co.bogote.springblogbackend.service;

import bw.co.bogote.springblogbackend.dto.RegisterRequest;
import bw.co.bogote.springblogbackend.model.User;
import bw.co.bogote.springblogbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        userRepository.save(user);
    }
}
