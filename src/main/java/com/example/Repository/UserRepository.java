package com.example.Repository;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface  UserRepository extends JpaRepository<User,Integer> {
}
