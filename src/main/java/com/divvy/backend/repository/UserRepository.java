package com.divvy.backend.repository;

import com.divvy.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByContactNumber(String contactNumber);
}
