package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.DriverServiceCharge;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceChargeService {

  Map<Long,DriverServiceCharge> driverServiceChargeMap = new HashMap<>();

  public void addDriverServiceCharge(DriverServiceCharge driverServiceCharge){
    driverServiceChargeMap.put(driverServiceCharge.getId(), driverServiceCharge);
  }

}
