package com.example.netmovie.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.netmovie.Entity.Board;
import com.example.netmovie.Entity.Reply;
import com.example.netmovie.Repository.BoardRepository;
import com.example.netmovie.Repository.ReplyRepository;
import com.example.netmovie.request.ReplyRequest;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	private final ReplyRepository replyRepository;
	private final BoardRepository boardRepository;
	
	public ReplyServiceImpl(ReplyRepository replyRepository, BoardRepository boardRepository) {
		this.replyRepository = replyRepository; 
		this.boardRepository = boardRepository; 
	}
	
	//´ñ±Û µî·Ï
	@Override
	public boolean createReply(ReplyRequest reply) {
		try {
			Board board= boardRepository.findBoardByboardNo(reply.getBoardNo()); 
			Reply re= Reply.builder()
						.board(board)
						.writer(reply.getWriter())
						.content(reply.getContent())
						.build(); 
			
			replyRepository.save(re);
			return true;
		}catch(Exception e) {
			return false; 
		}
	}

}
