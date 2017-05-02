/**
 * 
 */
package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author neildcruz
 *
 */
@Data
@Entity(name="U_GROUP")
@EqualsAndHashCode(callSuper = true)
public class Group extends BaseEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String ownerEmail;
	
	

}
