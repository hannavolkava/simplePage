package com.demosoft.onepage.repository;

import com.demosoft.onepage.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andrii_Korkoshko on 9/6/2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
