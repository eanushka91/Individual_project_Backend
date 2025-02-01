package edu.icet.service.impl;

import edu.icet.dto.AuthResponse;
import edu.icet.dto.User;
import edu.icet.entity.E_LicenseEntity;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
private final UserRepository repository;
private final ModelMapper mapper;
private final AuthenticationManager authManager;
private final JwtService jwtService;
private final BCryptPasswordEncoder passwordEncoder;
    @Override
    public AuthResponse userLogin(String username, String password) {
        Authentication authentication =
                authManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                username,
                                password
                        )
                );

        if (authentication.isAuthenticated()) {
            String token = jwtService.generateToken(username);
            User user = mapper.map(repository.findByUsername(username), User.class);
            System.out.println(user);
            return new AuthResponse(token,user);
        }
        throw new RuntimeException("Could not find");
    }


    @Override
    public User signup(User usersDTO) {
        usersDTO.setPassword(passwordEncoder.encode(usersDTO.getPassword()));
        UserEntity users = mapper.map(usersDTO, UserEntity.class);
        return mapper.map(repository.save(users), User.class);
    }

}
