package com.example.netmovie.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.netmovie.Entity.Reply;
import com.example.netmovie.Service.ReplyService;
import com.example.netmovie.request.ReplyRequest;


@RestController
@RequestMapping("/reply")
public class ReplyController {
	
	private final ReplyService replyService;
	
	public ReplyController(ReplyService replyService) {
		this.replyService = replyService; 
	}
	
	//´ñ±Û µî·Ï
	@PostMapping
	public String createReply(@RequestBody ReplyRequest reply) {
		boolean res = replyService.createReply(reply);
		if(res) return "success";
		return "fail";
	}
}
