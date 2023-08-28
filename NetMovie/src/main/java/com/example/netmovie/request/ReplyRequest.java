package com.example.netmovie.request;

import lombok.Getter;

/*댓글 등록할때 받을 객체 매핑할 클래스 */

@Getter
public class ReplyRequest {
	
	int boardNo; //게시글 번호 
	
	String writer; //작성자 
	
	String content; //내용
}
