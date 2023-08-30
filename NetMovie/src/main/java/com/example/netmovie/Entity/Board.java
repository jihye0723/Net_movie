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

	@OneToMany(mappedBy="board")
	@JsonIgnore
	private List<Reply> replyes = new ArrayList<>();
	
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
