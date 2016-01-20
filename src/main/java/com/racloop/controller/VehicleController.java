package com.racloop.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racloop.entity.VehicleTracker;
import com.racloop.entity.VehicleTrackerDetailedKey;
import com.racloop.repo.VehicleRepo;

@RestController
public class VehicleController {
	
	 @Autowired
	    VehicleRepo vehicleRepo;


	    @RequestMapping("/find")
	    public String getInfo() {
	        List<VehicleTracker> vtList = vehicleRepo.findByIdAndDate("DLAN6788","2016-01-20") ;
	        for(VehicleTracker vt : vtList){
	        	 System.out.println(vt + "\n");
	        }
			return "Success";
	    }
	    
	    @RequestMapping("/add")
	    public String addInfo() {
	    	VehicleTracker vt1 = new VehicleTracker();
	    	Map<String,String> coordinatesMap = new HashMap<String,String>();
	    	coordinatesMap.put("Lat","30N");
	    	coordinatesMap.put("Long","41W");
	    	VehicleTrackerDetailedKey pk = new VehicleTrackerDetailedKey();
	    	pk.setId("DLAN6788");
			pk.setEventTime(new Date());
			pk.setTrackingDate("2016-01-20");
	    	vt1.setPk(pk);
			vt1.setCoordinates(coordinatesMap);
			vehicleRepo.save(vt1);
			return "Success";
	    }
	
	

}
