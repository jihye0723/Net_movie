package com.example.netmovie.Entity;

import java.util.Set;

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
	private int boardNo;
	
	@Column(columnDefinition = "VARCHAR(100)", nullable = false) 
	private String title; 
	
	@Column(columnDefinition = "VARCHAR(16000)", nullable = false)
	private String content;
	
	@Column(columnDefinition = "VARCHAR(16)", nullable = false)
	private String writer;

	@OneToMany(mappedBy="board", cascade= CascadeType.ALL, orphanRemoval = true) 
	private Set<Reply> replyes;
	
	@Builder
	public Board(String title, String content, String writer) {
		this.title=title;
		this.content=content;
		this.writer=writer;
	}
	
	//�� ���� 
	public void update(String title, String content) {
		
	}
	
}
