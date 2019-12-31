package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.Driver;
import com.port60.vehicledispatcher.model.DriverStatus;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class DriverLocationIngestService {

  private Map<Long, DriverStatus> driverMap = new HashMap<>();

  public void  updateDriverLocation(Long driverId, Double longitude, Double latitude,Boolean available){

    DriverStatus driverStatus;

    if(driverMap.containsKey(driverId)){
      driverStatus = driverMap.get(driverId);
      driverStatus.setLocationTime(LocalDateTime.now());
      driverStatus.setLongitude(longitude);
      driverStatus.setLatitude(latitude);
      driverStatus.setAvailable(available);
      //the zone will come from a defined boundary using long/lat
      driverStatus.setZoneId("A");
      driverStatus.setZoneEntrytime(LocalDateTime.now());
    } else {
      //TODO most likely driver info is not needed as much however if it is it should come from another microservice
      Driver driver = new Driver();
      driver.setId(driverId);
      driverStatus = new DriverStatus();
      driverStatus.setDriver(driver);
      driverStatus.setLongitude(longitude);
      driverStatus.setLatitude(latitude);
      //the zone will come from a defined boundary using long/lat
      driverStatus.setZoneId("A");
      driverStatus.setZoneEntrytime(LocalDateTime.now());
      driverStatus.setAvailable(available);
      //TODO think about this server might not always represent local time of driver and place
      //might need  to localise this based on driver location profile
      driverStatus.setLocationTime(LocalDateTime.now());
    }

  }

  public List<DriverStatus> getDriverLocationsForZone(String zone){
    List<DriverStatus> driversInZone = driverMap.values().stream().filter(d -> d.getZoneId().equals(zone))
        .collect(Collectors.toList());

    return driversInZone;
  }

}
