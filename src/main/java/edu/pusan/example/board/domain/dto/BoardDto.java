package edu.pusan.example.board.domain.dto;

import java.util.Date;

import edu.pusan.example.board.domain.Board;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardDto {
    private int boardId;
    private String title;
    private String contents;
    private Date insertDate;
    private String used;
    private String writerId;
    private String writerName;

    public Board build() {
        Board board = new Board();
        board.setBoardId(boardId);
        board.setTitle(title);
        board.setContents(contents);
        board.setInsertDate(insertDate);
        board.setUsed(used);
        return board;
    }
}
