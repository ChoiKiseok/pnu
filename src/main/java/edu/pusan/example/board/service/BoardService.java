package edu.pusan.example.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.pusan.example.board.domain.Board;
import edu.pusan.example.board.domain.dto.BoardDto;
import edu.pusan.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    
    public List<BoardDto> getBoardList() {
        List<Board> boardList = boardRepository.findAll();
        ArrayList<BoardDto> result = new ArrayList<BoardDto>();
        
        for (Board board : boardList) {
            BoardDto temp = BoardDto.builder()
                                .boardId(board.getBoardId())
                                .title(board.getTitle())
                                .contents(board.getContents())
                                .insertDate(board.getInsertDate())
                                .used(board.getUsed())
                                .writerId(board.getWriter().getUserId())
                                .writerName(board.getWriter().getName())
                                .build();
            result.add(temp);
        }

        return result;
    }
}
