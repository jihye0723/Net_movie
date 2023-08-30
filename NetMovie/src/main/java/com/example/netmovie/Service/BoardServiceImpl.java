package com.example.netmovie.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.netmovie.Entity.Board;
import com.example.netmovie.Repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{
	//������ ���� 
	private final BoardRepository boardRepository; 
	
	public BoardServiceImpl(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	
	
	//�Խñ� ��� 
	@Override
	public boolean createBoard(Board board) {
		try {
			boardRepository.save(board);
			return true; 
		}catch(Exception e) {
			return false; 
		}
	}


	//�Խñ� ��ü ��� 
	@Override
	public List<Board> getBoardList() {
		List<Board> list= boardRepository.findAll(); 
		System.out.println(list.get(0).getTitle());
		return list; 
	}
	
}	
