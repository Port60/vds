package com.port60.vehicledispatcher.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Location {

  private Double longitude;

  private Double latitude;

  private LocalDateTime locationTime;

  private LocalDateTime zoneEntrytime;

  private String zoneId;

}
