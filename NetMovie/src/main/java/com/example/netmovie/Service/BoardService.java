package com.example.netmovie.Service;

import java.util.List;

import com.example.netmovie.Entity.Board;

public interface BoardService {
	//�Խñ� ���
	public boolean createBoard(Board board); 
	
	//�Խñ� ��ü �ҷ����� 
	public List<Board> getBoardList(); 
}
