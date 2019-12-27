/**
 * 
 */
package com.CodeEZ.spring.Userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CodeEZ.spring.Userservice.model.User;

/**
 * @author muralidharan.v
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
