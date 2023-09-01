package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.Getter;

@Getter
@Entity
@Table(name="genre")
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int genreNo; 
	
	@Column(columnDefinition = "VARCHAR(30)") 
	private String genre; 
}
