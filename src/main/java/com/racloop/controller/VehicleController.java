package com.racloop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racloop.entity.VehicleTracker;
import com.racloop.repo.VehicleRepo;

@RestController
public class VehicleController {
	
	 @Autowired
	    VehicleRepo vehicleRepo;


	    @RequestMapping("/greeting")
	    public String getInfo() {
	    	System.out.println("i am in controller");
	        VehicleTracker vt = vehicleRepo.findByIdAndDate("DLAC3245","2016-04-03").get(0) ;
	        System.out.println(vt);
	        return "Success";
	    }
	
	

}
