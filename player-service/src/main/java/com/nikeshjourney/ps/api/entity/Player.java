package com.nikeshjourney.ps.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Player_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	
	@Id
	private int jersy;
	private String name;
	private int centuries;
	
	

}
