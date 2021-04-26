package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.User9;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IUserRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IUserRepository extends JpaRepository<User9, Long> 
{

	boolean existsByUsername(String username);
	

	
}
