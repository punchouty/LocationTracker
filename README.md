# LocationTracker
LocationTracker TBD

# Cassandra config

Created a class CassandraConfiguration.java to override default behavior

# Create Keyspace (something like schema) for our use
CREATE KEYSPACE racloop
WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

use <keyspace name>;


CREATE TABLE racloop.vehicle_by_day (
vehicle_id text,
date text,
event_time timestamp,
coordinates map<text,text>,
PRIMARY KEY ((vehicle_id ,date),event_time)
);

Need to create a separate class for complex/composite primary key - see VehicleTrackerDetailedKey.java


