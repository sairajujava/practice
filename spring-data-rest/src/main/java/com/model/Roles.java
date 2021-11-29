package com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_roles")
@Data
@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Roles {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="r_id")
    private long id;

    @Column(name="r_name",length = 60)
    private String name;
    
	/*
	 * @ManyToMany(mappedBy = "roles" , cascade = CascadeType.ALL) private
	 * Set<Users> users = new HashSet<Users>();
	 */
}
