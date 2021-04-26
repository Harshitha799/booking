package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.FeedBack9;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IFeedbackRepository interface  
 * Created date: 23-04-2021
 * 
 ******************************************************************/

@Repository
public interface IFeedBackRepository extends JpaRepository<FeedBack9, Integer>
{

	boolean existsByRouteName(String routeName);
	

}
