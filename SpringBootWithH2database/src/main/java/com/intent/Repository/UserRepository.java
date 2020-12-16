package com.intent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intent.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
