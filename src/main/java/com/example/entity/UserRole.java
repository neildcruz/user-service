/**
 * 
 */
package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * @author neildcruz
 *
 */
@Data
@Entity
public class UserRole implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	private User user;
	
	@Id
	@ManyToOne 
	private Role role;

}
