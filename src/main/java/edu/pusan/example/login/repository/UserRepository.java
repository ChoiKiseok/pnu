package edu.pusan.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pusan.example.login.domain.UserVO;

public interface UserRepository extends JpaRepository<UserVO, String> {
  
}
