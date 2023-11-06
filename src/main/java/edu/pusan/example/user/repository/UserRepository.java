package edu.pusan.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pusan.example.user.domain.UserVO;

public interface UserRepository extends JpaRepository<UserVO, String> {
  
}
