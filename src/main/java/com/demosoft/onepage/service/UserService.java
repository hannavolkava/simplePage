package com.demosoft.onepage.service;

import com.demosoft.onepage.entiry.User;
import com.demosoft.onepage.entiry.form.UserForm;

/**
 * Created by Andrii_Korkoshko on 9/6/2016.
 */
public interface UserService {

    User createUser(UserForm user);

    User login(String username, String password);
}
