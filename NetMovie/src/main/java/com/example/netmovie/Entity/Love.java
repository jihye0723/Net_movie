package com.example.netmovie.Entity;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*사용자별 좋아요 한 영상 목록 */

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
