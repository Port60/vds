package com.port60.vehicledispatcher.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DriverFare {

  private DriverStatus driverStatus;

  private Fare fare;

  private boolean completed;

  private LocalDateTime completionTime;

}
