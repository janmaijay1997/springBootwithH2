package com.intent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intent.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
