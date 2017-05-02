/**
 * 
 */
package com.example.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;

import lombok.Getter;

/**
 * @author neildcruz
 *
 */
@MappedSuperclass
@Getter
public class BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String SYSTEM_USER_NAME = "system";
	
	private Date createDate;
	private Date lastUpdateDate;
	private String createdBy;
	private String lastUpdatedBy;
	
	@PrePersist
	void onCreate() {
		this.createDate = new Date();
		this.createdBy = getCurrentPrincipalUsername();
	}
	
	
	@PreUpdate
	void onUpdate() {
		this.lastUpdateDate = new Date();
		this.lastUpdatedBy = getCurrentPrincipalUsername();
	}
	
	private String getCurrentPrincipalUsername() {
		SecurityContext securityContext = SecurityContextHolder.getContext();
		if(null != securityContext && null != securityContext.getAuthentication()) {
			if(!StringUtils.isEmpty(securityContext.getAuthentication().getName())) {
				return securityContext.getAuthentication().getName();
			}
		}
		
		return SYSTEM_USER_NAME;
	}

}
