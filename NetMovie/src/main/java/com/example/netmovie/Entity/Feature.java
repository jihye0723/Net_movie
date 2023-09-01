package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.Getter;

@Getter
@Entity
@Table(name="feature")
public class Feature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int featureNo; 
	
	@Column(columnDefinition = "VARCHAR(30)") 
	private String feature; 
}
