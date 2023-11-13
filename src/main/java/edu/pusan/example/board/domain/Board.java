package edu.pusan.example.board.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import edu.pusan.example.user.domain.User;
import lombok.Data;

@Data
@Entity(name = "tb_board")
public class Board {
    @Id
    private int boardId;
    private String title;
    private String contents;
    private Date insertDate;
    private String used;

    @OneToOne
    @JoinColumn(name = "writer_id")
    private User writer;
}
