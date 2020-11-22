package com.demosoft.onepage.controller.login;

import com.demosoft.onepage.entiry.User;
import com.demosoft.onepage.entiry.form.UserForm;
import com.demosoft.onepage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Andrii_Korkoshko on 9/6/2016.
 */
@RestController
@RequestMapping("/account")
public class AutorizationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public UserForm login(@RequestBody UserForm createUser) {
        userService.login(createUser.getUsername(), createUser.getPassword());
        return createUser;
    }


    @RequestMapping(value = "reg", method = RequestMethod.POST)
    public User reg(@RequestBody UserForm createUser) {
        System.out.println(createUser);
        return userService.createUser(createUser);
    }

}
