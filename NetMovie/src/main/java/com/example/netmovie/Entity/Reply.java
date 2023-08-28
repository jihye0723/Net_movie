package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name="reply")
@NoArgsConstructor
public class Reply extends BaseTimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int replyNo; 
	
	@Column(columnDefinition = "VARCHAR(16)", nullable = false)
	private String writer;
	
	@Column(columnDefinition = "VARCHAR(1000)", nullable = false)
	private String content;
	
	//�ܷ�Ű, ����Ŭ����:��ǥŬ���� (N:1 ����)
	@ManyToOne
	@JoinColumn(name="boardNo")
	private Board board; 
	
	@Builder
	public Reply(Board board, String writer, String content) {
		this.board = board;
		this.writer = writer;
		this.content = content; 
	}
	
	
}
