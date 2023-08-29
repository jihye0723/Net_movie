package com.example.netmovie.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name ="user")
@NoArgsConstructor
public class User {
	
	@Id
	private String userNo; 
	
	@Column(columnDefinition = "VARCHAR(16)", nullable = false)
	private String userid;
	
	@Column(columnDefinition = "VARCHAR(255)", nullable= false)
	private String userpw;
	
	@Column(columnDefinition = "VARCHAR(45)") 
	private String genres; 
	
	@Builder
	public User(String userNo, String userid, String userpw, String genres ){
		this.userNo = userNo;
		this.userid = userid;
		this.userpw = userpw;
		this.genres = genres;
	}
}
