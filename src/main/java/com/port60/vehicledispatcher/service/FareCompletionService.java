package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.Fare;
import org.springframework.beans.factory.annotation.Autowired;

public class FareCompletionService {

  @Autowired
  private DriverFareService driverFareService;

  public void fareCompleted(Fare fare) {
    driverFareService.completeFare(fare.getId());
  }

}
