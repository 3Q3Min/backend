package com.ksy.backend.account.repository;

import com.ksy.backend.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
