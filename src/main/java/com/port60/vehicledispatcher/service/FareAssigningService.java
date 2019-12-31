package com.port60.vehicledispatcher.service;


import com.port60.vehicledispatcher.model.DriverFare;
import com.port60.vehicledispatcher.model.DriverStatus;
import com.port60.vehicledispatcher.model.Fare;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FareAssigningService {

  @Autowired
  private DriverFareService driverFareService;

  public void assignFare(Fare fare, DriverStatus driverStatus){
    DriverFare driverFare  = new DriverFare();
    driverFare.setDriverStatus(driverStatus);
    driverFare.setFare(fare);
    driverStatus.setAvailable(false);
    fare.setFareAssigned(true);
    fare.setFareAssignedDateTime(LocalDateTime.now());
    driverFareService.addDriverFare(driverFare);
    System.out.println("Broadcast fare details to driver");
  }

}
