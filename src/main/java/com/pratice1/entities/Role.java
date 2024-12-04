package com.pratice1.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private int id;
	@Column
	private String roleName;
	
	 @ManyToMany(mappedBy = "vaitro")
	  private Collection<Customer> role;
	 
	
	
	
	public Role() {
		super();
	}



	public Role(int id, String roleName, Collection<Customer> role) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.role = role;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getRoleName() {
		return roleName;
	}



	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}



	public Collection<Customer> getRole() {
		return role;
	}



	public void setRole(Collection<Customer> role) {
		this.role = role;
	}
	
	
	

}
