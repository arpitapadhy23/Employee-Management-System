package com.reactfullstack.fullstackbackend.repository;

import com.reactfullstack.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
