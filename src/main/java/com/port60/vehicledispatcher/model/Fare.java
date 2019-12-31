package com.port60.vehicledispatcher.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedList;
import lombok.Data;

@Data
public class Fare {

  private Long id;

  private String customerName;

  private String customerContactNumber;

  private Location pickupLocation;

  private VEHICLE_CATEGORIES vehicleSize;

  private LinkedList<DestinationLocation> destination;

  private BigDecimal estimate;

  private boolean fareAssigned;

  private LocalDateTime fareAssignedDateTime;

  private boolean fareCancelled;

  private LocalDateTime fareCancelledTime;


}
