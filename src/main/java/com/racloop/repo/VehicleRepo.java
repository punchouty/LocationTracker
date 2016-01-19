package com.racloop.repo;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.racloop.entity.VehicleTracker;


public interface VehicleRepo extends CassandraRepository<VehicleTracker>  {
	
	@Query("select * from vehicle_by_day where vehicle_id = ?0 and date = ?1")
	    List<VehicleTracker> findByIdAndDate(String id,String date);
	
	//List<VehicleTracker> findById(String id);
	 
}
