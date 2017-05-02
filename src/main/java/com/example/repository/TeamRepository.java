/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Team;

/**
 * @author neildcruz
 *
 */
@RepositoryRestResource
public interface TeamRepository extends JpaRepository<Team, Long> {

}
