package com.ramesh.springreact.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contacts {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private BigInteger number;
	private String message;

}
