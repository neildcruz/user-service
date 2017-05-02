/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.User;

/**
 * @author neildcruz
 *
 */
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

}
