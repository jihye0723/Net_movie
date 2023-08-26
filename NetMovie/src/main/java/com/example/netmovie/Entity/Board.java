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
@NoArgsConstructor //�ƹ��� �Ű������� ���� ������ �ڵ����� 
//@AllArgsConstructor//����ʵ忡 ���� ������ �ڵ� ����
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
	
	//�� ���� 
	public void update(String title, String content) {
		
	}
	
}
