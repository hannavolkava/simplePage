package com.demosoft.onepage.service;

import com.demosoft.onepage.entiry.User;
import com.demosoft.onepage.entiry.form.UserForm;
import com.demosoft.onepage.exception.UserIsExistException;
import com.demosoft.onepage.exception.UserNotFoundException;
import com.demosoft.onepage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Andrii_Korkoshko on 9/6/2016.
 */
@Service
public class UserSericeImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserForm user) {
        checkIfUserExist(user);
        return userRepository.save(new User(user));
    }

    private void checkIfUserExist(UserForm user) {
        if (userRepository.findByUsername(user.getUsername()) != null)
            throw new UserIsExistException();
    }

    @Override
    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password))
            return user;
        else
            throw new UserNotFoundException();
    }
}
