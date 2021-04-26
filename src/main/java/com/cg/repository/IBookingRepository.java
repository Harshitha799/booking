package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.dto.Bookingdto9;
import com.cg.entity.Booking9;
import com.cg.entity.FeedBack9;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IBookingRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IBookingRepository extends JpaRepository<Booking9, Long>
{

	public Booking9 findAllByBookingId(long bookingId);

	public Bookingdto9 save(Bookingdto9 bookingdto);

	boolean existsByBookingId(long bookingId);

	@Query("select b from Booking9 b , User9 u where b.username=u.username and u.username=:username")
	public Booking9 findAllByUsername(@Param("username") String username);
		
	@Query("select fb from FeedBack9 fb where fb.routeName = :routeName  ")
	public List<FeedBack9> getFeedBackByBusRoute(@Param("routeName") String routeName);



	

	


	

	
	
	
	
	

	//public Booking9 getBookingByBookingId(long bookingId);



	
}
