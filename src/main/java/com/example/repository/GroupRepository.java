/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Group;

/**
 * @author neildcruz
 *
 */
@RepositoryRestResource
public interface GroupRepository extends JpaRepository<Group, Long> {

}
