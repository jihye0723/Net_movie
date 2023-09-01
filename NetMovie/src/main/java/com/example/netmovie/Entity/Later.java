package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*사용자별 나중에 볼 영상 목록 */

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
