package edu.icet.service;

import edu.icet.dto.AuthResponse;
import edu.icet.dto.User;

public interface UserService {
    AuthResponse userLogin(String username, String password);
    User signup(User usersDTO);
}
