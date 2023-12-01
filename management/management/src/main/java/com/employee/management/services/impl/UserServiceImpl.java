package com.employee.management.services.impl;

import com.employee.management.entity.User;
import com.employee.management.repository.UserRepository;
import com.employee.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String createUser(User user) {

        User save = userRepository.save(user);

        return null;
    }

    @Override
    public String deleteUser(int user_id) {
        return null;
    }

    @Override
    public User updateUser(User user, int user_id) {
        return null;
    }

    @Override
    public User getUser(int user_id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }
}
