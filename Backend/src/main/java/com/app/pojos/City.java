package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="city")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class City extends BaseEntity{

	@Column(length = 50)
	private String name;
	
	private String description;
	
	@Column(length = 10)
	private String status;

	@ManyToOne
    private District district;	
	
	@ManyToOne
    private State state;	
}
