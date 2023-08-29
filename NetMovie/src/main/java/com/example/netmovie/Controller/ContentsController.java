package com.example.netmovie.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.netmovie.Service.ContentsService;

@RestController
@RequestMapping("/contents")
public class ContentsController {
	
	private final ContentsService contentsService;
	
	public ContentsController(ContentsService contentsService) {
		this.contentsService = contentsService;
	}
	
	//ÄÁÅÙÃ÷ ºÒ·¯¿À±â 
}
