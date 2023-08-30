package com.example.netmovie.Service;

import java.util.List;

import com.example.netmovie.Entity.Board;

public interface BoardService {
	//게시글 등록
	public boolean createBoard(Board board); 
	
	//게시글 전체 불러오기 
	public List<Board> getBoardList(); 
}
