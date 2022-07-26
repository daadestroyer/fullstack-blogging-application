package com.blogging.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogging.backend.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
