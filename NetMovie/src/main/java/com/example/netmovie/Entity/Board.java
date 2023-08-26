package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
//@Setter
@Entity  
@Table(name="board")
@NoArgsConstructor //아무런 매개변수가 없는 생성자 자동생성 
//@AllArgsConstructor//모든필드에 대한 생성자 자동 생성
public class Board extends BaseTimeEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int board_no;
	
	@Column(columnDefinition = "VARCHAR(100)", nullable = false) 
	private String title; 
	
	@Column(columnDefinition = "VARCHAR(16000)", nullable = false)
	private String content;
	
	@Column(columnDefinition = "VARCHAR(16)", nullable = false)
	private String writer;


	@Builder
	public Board(int board_no, String title, String content, String writer) {
		this.board_no=board_no;
		this.title=title;
		this.content=content;
		this.writer=writer;
	}
	
	//글 수정 
	public void update(String title, String content) {
		
	}
	
}
