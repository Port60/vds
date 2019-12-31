package com.port60.vehicledispatcher.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DriverServiceCharge {
  private long id;

  private Driver driver;

  private WorkingShift workingShift;

  private boolean paid;

  private LocalDateTime chargePaymentDate;

}
