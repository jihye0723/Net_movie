package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*����ں� ���߿� �� ���� ��� */

@Getter
@Entity
@Table(name="later")
@NoArgsConstructor
public class Later {
	
	@Id
	private String userNo; 
	
	@Column(columnDefinition = "VARCHAR(10000)") 
	private String laterList; 
	
	@Builder
	public Later(String userNo, String laterList) {
		this.userNo= userNo;
		this.laterList = laterList; 
	}
}
