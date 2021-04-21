package bw.co.bogote.springblogbackend.service;

import bw.co.bogote.springblogbackend.dto.RegisterRequest;
import bw.co.bogote.springblogbackend.model.User;

public class AuthService {
    public void sighup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
    }
}
