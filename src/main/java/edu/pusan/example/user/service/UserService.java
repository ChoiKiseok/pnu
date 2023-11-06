package edu.pusan.example.user.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.pusan.example.user.domain.UserVO;
import edu.pusan.example.user.domain.dto.UserDto;
import edu.pusan.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public Boolean checkUser(UserDto userDto) {
    Optional<UserVO> user = userRepository.findById(userDto.getUserId());

    if(user.isPresent()) {
      if(user.get().getUserPwd().equals(userDto.getUserPwd())) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public void insertUser(UserVO user) {
    userRepository.save(user);
  }
}
