package com.example.netmovie.Service;

import org.springframework.stereotype.Service;

import com.example.netmovie.Entity.Board;
import com.example.netmovie.Repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{
	//생성자 주입 
	private final BoardRepository boardRepository; 
	
	public BoardServiceImpl(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	
	
	//게시글 등록 
	@Override
	public boolean createBoard(Board board) {
		try {
			boardRepository.save(board);
			return true; 
		}catch(Exception e) {
			return false; 
		}
	}
	
}	
