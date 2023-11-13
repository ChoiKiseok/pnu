package edu.pusan.example.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pusan.example.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{
    
}
