package com.example.netmovie.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name ="contents")
@DynamicInsert
@NoArgsConstructor
public class Contents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contentsNo; 
	
	@Column(columnDefinition = "VARCHAR(5000)")
	private String image;
	
	@Column(columnDefinition = "VARCHAR(1000)", nullable =false)
	private String title; 
	
	@Column(columnDefinition = "VARCHAR(10000)")
	private String detail;
	
	@Column(columnDefinition = "VARCHAR(100)") 
	private String genres; 
	
	@Column(columnDefinition = "VARCHAR(100)") 
	private String features;
	
	@Column
	private float score; 
	

}
