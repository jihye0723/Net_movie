package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*����ں� ���ƿ� �� ���� ��� */

@Getter
@Entity
@Table(name="love")
@NoArgsConstructor
public class Love {
	
	@Id
	private String userNo; 
	
	@Column(columnDefinition = "VARCHAR(10000)") 
	private String loveList; 
	
	@Builder
	public Love(String userNo, String loveList) {
		this.userNo= userNo;
		this.loveList = loveList; 
	}
}
