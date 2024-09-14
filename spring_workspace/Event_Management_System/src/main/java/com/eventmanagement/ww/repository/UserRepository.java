package com.eventmanagement.ww.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.www.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
