package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.dto.Bookingdto;
import com.cg.entity.Booking;
import com.cg.entity.FeedBack;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IBookingRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IBookingRepository extends JpaRepository<Booking, Long>
{

	public Booking findAllByBookingId(long bookingId);

	public Bookingdto save(Bookingdto bookingdto);

	boolean existsByBookingId(long bookingId);

	@Query("select b from Booking b , User u where b.username=u.username and u.username=:username")
	public Booking findAllByUsername(@Param("username") String username);
		
	@Query("select fb from FeedBack fb where fb.routeName = :routeName  ")
	public List<FeedBack> getFeedBackByBusRoute(@Param("routeName") String routeName);



	

}
