package com.racloop.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * @author nkapo1
 *
 */
@Table("vehicle_by_day")
public class VehicleTracker implements Serializable {
	

	private static final long serialVersionUID = 1L;

	
	@PrimaryKey
	private VehicleTrackerDetailedKey pk;
	
	
	private Map<String,String> coordinates;


	public VehicleTrackerDetailedKey getPk() {
		return pk;
	}

	public void setPk(VehicleTrackerDetailedKey pk) {
		this.pk = pk;
	}


	public Map<String,String> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Map<String,String> coordinates) {
		this.coordinates = coordinates;
	}
	
	@Override
	public String toString (){
		return "[ id=" + pk.getId() + "," + pk.getTrackingDate() + "," + pk.getEventTime() + "]";
	}
	
}
