package edu.icet.service.impl;

import edu.icet.dto.User;
import edu.icet.entity.E_LicenseEntity;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
private final UserRepository repository;
private final ModelMapper mapper;
    @Override
    public User userLogin(String username, String password) {
        UserEntity userEntity = repository.findByUsername(username);
        if (userEntity.getPassword().equals(password)) {
            return mapper.map(userEntity, User.class);
        }
        return null;
    }


}
