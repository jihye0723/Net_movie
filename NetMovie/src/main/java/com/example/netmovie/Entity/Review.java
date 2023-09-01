package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@Table(name="review")
@NoArgsConstructor
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewNo; 
	
	@Column(columnDefinition = "VARCHAR(16)", nullable = false) 
	private String writer;
	
	@Column(nullable = false)
	private float score;
	
	@Column(columnDefinition = "VARCHAR(1000)") 
	private String review; 
	
	@ManyToOne
	@JoinColumn(name="contentsNo")
	private Contents contents; 
	
	@Builder
	public Review(Contents contents, String writer, float score, String review) {
		this.contents= contents;
		this.writer = writer;
		this.score = score;
		this.review = review; 
	}
	
}
