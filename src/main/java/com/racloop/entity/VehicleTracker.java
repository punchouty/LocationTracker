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

	//@PrimaryKey(value = "vehicle_id")
	//private String id;
	
	@PrimaryKey
	private VehicleTrackerDetailedKey pk;
	
	/* @Column (value = "date")
	private String trackingDate;
	
	 @Column (value = "event_time")
	private Date eventTime;*/
	
	private Map<String,String> coordinates;

/*	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}*/

	/*public String getTrackingDate() {
		return trackingDate;
	}*/

	public VehicleTrackerDetailedKey getPk() {
		return pk;
	}

	public void setPk(VehicleTrackerDetailedKey pk) {
		this.pk = pk;
	}

/*	public void setTrackingDate(String trackingDate) {
		this.trackingDate = trackingDate;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}*/

	public Map<String,String> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Map<String,String> coordinates) {
		this.coordinates = coordinates;
	}
	
	@Override
	public String toString (){
		return "[ id=" + pk.getId() + "," + pk.getTrackingDate() + "," + pk.getEventTime() + "]"; // date = " + trackingDate + " event Time = " + eventTime + "]";
	}
	
}
