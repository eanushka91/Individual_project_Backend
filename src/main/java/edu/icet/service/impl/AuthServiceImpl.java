package edu.icet.service.impl;

import edu.icet.dto.UserPrinciple;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity authUsers = userRepository.findByUsername(username);

        if(authUsers == null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserPrinciple(authUsers);
    }

}
