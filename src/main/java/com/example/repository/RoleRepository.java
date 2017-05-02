/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Role;

/**
 * @author neildcruz
 *
 */
@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Long> {

}
