package com.port60.vehicledispatcher.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DriverStatus extends Location {

  private Driver driver;

  private boolean available;

  private boolean shortBreak;

  private LocalDateTime shortBreakTime;

  private Integer priority;




}
