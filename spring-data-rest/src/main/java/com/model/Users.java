package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Table(name = "tbl_users", uniqueConstraints = { @UniqueConstraint(columnNames = { "u_username" }),
		@UniqueConstraint(columnNames = { "u_email" }) })

@Data
@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
	private long id;
	@Column(name = "u_name")
	private String name;
	@Column(name = "u_username")
	private String username;
	@Column(name = "u_email")
	private String email;
	@Column(name = "u_password")
	private String password;
	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinTable(name = "user_roles", 
	joinColumns = @JoinColumn(
			name = "u_id"), 
	inverseJoinColumns = @JoinColumn(
			name = "r_id"))
	private Set<Roles> roles = new HashSet<Roles>();

}
