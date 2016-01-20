package com.racloop.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.cassandra.core.Ordering;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

/**
 * @author nkapo1
 *
 */
@PrimaryKeyClass
public class VehicleTrackerDetailedKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@PrimaryKeyColumn(name = "vehicle_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String id;

	@PrimaryKeyColumn(name = "date", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private String trackingDate;

	@PrimaryKeyColumn(name = "event_time", ordinal = 2, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
	private Date eventTime;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventTime == null) ? 0 : eventTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((trackingDate == null) ? 0 : trackingDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleTrackerDetailedKey other = (VehicleTrackerDetailedKey) obj;
		if (eventTime == null) {
			if (other.eventTime != null)
				return false;
		} else if (!eventTime.equals(other.eventTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (trackingDate == null) {
			if (other.trackingDate != null)
				return false;
		} else if (!trackingDate.equals(other.trackingDate))
			return false;
		return true;
	}

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

}
