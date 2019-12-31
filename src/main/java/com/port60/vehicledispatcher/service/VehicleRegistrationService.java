package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.Vehicle;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class VehicleRegistrationService {

  Map<String, Vehicle> vehicles = new HashMap<>();

  public void registerVehicle(Vehicle vehicle){
    //May need to think about this sometimes drivers use
    // private plates and do plate transfers.
    vehicles.put(vehicle.getRegistrationNumber(),vehicle);

  }

}
