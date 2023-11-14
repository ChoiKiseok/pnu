package edu.pusan.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  
  @GetMapping("/")
  public String loginPage() {
    return "login";
  }
  @GetMapping("/main")
  public String mainPage() {
    return "main";
  }
}
