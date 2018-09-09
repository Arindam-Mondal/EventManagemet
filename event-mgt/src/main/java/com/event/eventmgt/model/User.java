package com.event.eventmgt.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "em_user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_sequence")
	@SequenceGenerator(name="user_sequence", sequenceName="USER_SEQ")
	@Column(name="object_id")
	private Long 	objectID;
	
	@Column(name="object_created_date")
	private Timestamp objectCreatedDate;
	
	@Column(name="object_updated_date")
	private Timestamp objectUpdatedDate;
	
	@NotNull
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="enable")
	private Boolean enable;
	
	@Column(name="description")
	private String description;
	
	@Column(name="phone")
	private int phone;
	
	@Column(name="email")
	private String email;

}
