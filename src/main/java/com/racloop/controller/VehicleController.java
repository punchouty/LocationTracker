package com.racloop.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racloop.entity.VehicleTracker;
import com.racloop.repo.VehicleRepo;

@RestController
public class VehicleController {
	
	 @Autowired
	    VehicleRepo vehicleRepo;


	    @RequestMapping("/find")
	    public String getInfo() {
	        VehicleTracker vt = vehicleRepo.findByIdAndDate("DLAC3245","2016-04-03").get(0) ;
	        System.out.println(vt);
			return "Success";
	    }
	    
	    @RequestMapping("/add")
	    public String addInfo() {
	    	VehicleTracker vt1 = new VehicleTracker();
			vt1.setId("DLAN6788");
			vt1.setEventTime(new Date());
			vt1.setTrackingDate("2016-01-20");
			vt1.setCoordinates("xy");
			vehicleRepo.save(vt1);
			return "Success";
	    }
	
	

}
