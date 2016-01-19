package com.racloop.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("vehicle_by_day")
public class VehicleTracker implements Serializable {
	
	@PrimaryKey(value = "vehicle_id")
	private String id;
	
	 @Column (value = "date")
	private String trackingDate;
	
	 @Column (value = "event_time")
	private Date eventTime;
	
	private String coordinates;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrackingDate() {
		return trackingDate;
	}

	public void setTrackingDate(String trackingDate) {
		this.trackingDate = trackingDate;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
	@Override
	public String toString (){
		return "[ id=" + id + " date = " + trackingDate + " event Time = " + eventTime + "]";
		
	}
	
}
