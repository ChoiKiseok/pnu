package edu.pusan.example.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pusan.example.dept.service.DeptService;
import edu.pusan.example.user.domain.dto.UserDto;
import edu.pusan.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
  private final UserService userService;
  private final DeptService deptService;

  @GetMapping("/loginPage")
  public String loginPage() {
    return "login";
  }

  @GetMapping("/signUpPage")
  public String signUpPage(Model model) {
    model.addAttribute("dept", deptService.getDeptList());
    return "signUp";
  }

  @PostMapping("/login")
  public String loginProcess(HttpSession session, UserDto user) {
    
    if(userService.checkUser(user)) {
      session.setAttribute("USER", userService.getUserInfo(user));
      return "main";
    } else {
      return "login";
    }
  }

  @PostMapping("/signUp")
  public String insertUser(UserDto userDto) {
    
    userService.insertUser(userDto);

    return "login";
  }

  @GetMapping("logout")
  public String logout(HttpSession session) {
    session.invalidate();
    return "login";
  }
  
}
