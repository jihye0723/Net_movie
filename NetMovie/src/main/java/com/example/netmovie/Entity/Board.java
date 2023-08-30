package com.example.netmovie.Entity;

import java.util.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private int boardNo;
	
	@Column(columnDefinition = "VARCHAR(100)", nullable = false) 
	private String title; 
	
	@Column(columnDefinition = "VARCHAR(16000)", nullable = false)
	private String content;
	
	@Column(columnDefinition = "VARCHAR(16)", nullable = false)
	private String writer;

	@OneToMany(mappedBy="board")
	@JsonIgnore
	private List<Reply> replyes = new ArrayList<>();
	
	@Builder
	public Board(String title, String content, String writer) {
		this.title=title;
		this.content=content;
		this.writer=writer;
	}
	
	//글 수정 
	public void update(String title, String content) {
		
	}
	
}
