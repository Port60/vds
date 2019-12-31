package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.Driver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DriverRegistrationService {

  Map<Long, Driver> drivers = new HashMap<>();

  public Driver registerDriver(Driver driver){
    drivers.put(driver.getId(),driver);
    return driver;
  }
}
