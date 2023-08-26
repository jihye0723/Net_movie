package com.example.netmovie.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.netmovie.Entity.Board;
import com.example.netmovie.Service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	private final BoardService boardService; 
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	//게시글 등록 
	@PostMapping
	public String createBoard(@RequestBody Board board){
		boolean res = boardService.createBoard(board);
		if(res) return "success";
		return "fail"; 
	}
	

}
