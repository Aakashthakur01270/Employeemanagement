package com.employee.management.services;

import com.employee.management.entity.User;

import java.util.List;

public interface UserService {

    public String createUser(User user);
    public String deleteUser(int user_id);

    public User updateUser(User user,int user_id);

    public User getUser(int user_id);

    public List<User> getAllUser();


}
