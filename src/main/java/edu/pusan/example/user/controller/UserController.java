package edu.pusan.example.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pusan.example.user.domain.User;
import edu.pusan.example.user.domain.dto.UserDto;
import edu.pusan.example.user.service.UserService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @GetMapping("/loginPage")
  public String loginPage() {
    return "login";
  }

  @GetMapping("/signup")
  public String signUpPage() {
    return "signup";
  }

  @PostMapping("/login")
  public String loginProcess(HttpSession session, UserDto user) {
    
    if(userService.checkUser(user)) {
      session.setAttribute("User", user.getUserId());
      return "redirect:/";
    } else {
      return "redirect:/loginPage";
    }
  }

  @PostMapping("/user/insert")
  public String insertUser(User userVO) {
    userService.insertUser(userVO);

    return "redirect:/loginPage";
  }
}
