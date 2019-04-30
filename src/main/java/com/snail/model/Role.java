package com.snail.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@Entity(name = "role_")
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable{

	private static final long serialVersionUID = -7562410173176807166L;
	public Role(long id,String name,String describe){
		this.id = id;
		this.name = name;
		this.describe = describe;

	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name_", length = 100, unique = true)
	@NotBlank
	private String name;

	@Column(name = "describe_", length = 1000)
	private String describe;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
