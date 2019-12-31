package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.DRIVER_PRIORITY_ENUM;
import com.port60.vehicledispatcher.model.DriverFare;
import com.port60.vehicledispatcher.model.Fare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FareCancellingService {

  @Autowired
  private DriverFareService driverFareService;

  public void cancelFare(Fare fare){
      DriverFare driverFare = driverFareService.cancelFare(fare.getId());
      //this may need to be a call to another service rather than updated here
      driverFare.getDriverStatus().setAvailable(true);
      driverFare.getDriverStatus().setPriority(
          driverFare.getDriverStatus().getPriority() +
              DRIVER_PRIORITY_ENUM.CANCELLATION_BOOST.getPriority());
  }

}
