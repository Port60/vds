package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.DriverStatus;
import com.port60.vehicledispatcher.model.Fare;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FareDispatcherService {

  @Autowired
  private DriverLocationIngestService driverLocationService;

  private FareAssigningService fareAssigningService;

  public void assignFareToDriverPool(Fare fare) {
    String zoneId = fare.getPickupLocation().getZoneId();

    List<DriverStatus> driverStatuses = driverLocationService.getDriverLocationsForZone(zoneId);

    Comparator<DriverStatus> driverZoneEntryComparator = Comparator
        .comparing(DriverStatus::getZoneEntrytime);

    Comparator<DriverStatus> driverZonePriorityComparator = Comparator
        .comparing(DriverStatus::getPriority).reversed();

    driverStatuses.sort(driverZoneEntryComparator);
    driverStatuses.sort(driverZonePriorityComparator);
    //make sure fare is not cancelled before we assign to driver
    if(!fare.isFareCancelled()) {
      driverStatuses.stream().filter(dl -> dl.isAvailable()).findFirst().ifPresent(
          dl -> fareAssigningService.assignFare(fare, dl)
      );

    }



  }


}
