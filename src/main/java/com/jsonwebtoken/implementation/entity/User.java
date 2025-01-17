package com.jsonwebtoken.implementation.entity;
import com.jsonwebtoken.implementation.enums.userRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="users")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String email;
	
	private String password;
	
	private String name;
	
	private userRole role;
	
	@Lob
	@Column(columnDefinition = "longblob")// to store user image in profile
	private byte[] img;
	
	 

}
