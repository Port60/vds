package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.DriverFare;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class DriverFareService {

  /**
   * this will be a persistance storage in the long run
   */
  private Map<Long, DriverFare> driverFareMap = new HashMap<>();


  public void addDriverFare(DriverFare driverFare){
    driverFareMap.put(driverFare.getFare().getId(), driverFare);
  }

  public DriverFare getDriverFare(Long fareId){
    return driverFareMap.get(fareId);
  }

  public DriverFare cancelFare(Long fareId){
    DriverFare driverFare = getDriverFare(fareId);
    driverFare.getFare().setFareCancelled(true);
    driverFare.getFare().setFareCancelledTime(LocalDateTime.now());
    return driverFare;
  }

  public DriverFare completeFare(Long fareId){
    DriverFare driverFare = getDriverFare(fareId);
    driverFare.setCompleted(true);
    driverFare.setCompletionTime(LocalDateTime.now());
    return driverFare;
  }
}
