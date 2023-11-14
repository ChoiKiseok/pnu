package edu.pusan.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pusan.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class BoardController {
  private final BoardService boardService;

  @GetMapping("/boardListPage")
  public String boardListPage(Model model) {
    model.addAttribute("boardList", boardService.getBoardList());
    return "boardList";
  }
}
