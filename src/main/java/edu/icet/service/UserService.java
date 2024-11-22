package edu.icet.service;

import edu.icet.dto.User;

public interface UserService {
    User userLogin(String username, String password);

}
