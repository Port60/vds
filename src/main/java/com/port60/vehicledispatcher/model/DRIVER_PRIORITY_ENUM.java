package com.port60.vehicledispatcher.model;

/**
 * Driver category weights can be overriden by the firm config.
 */
public enum DRIVER_PRIORITY_ENUM {

  DEFAULT_DRIVER(0),
  PREMIUM_DRIVER(1),
  FIRM_PRIORITY_DRIVER(3),
  FIRM_PRIORITY_PREMIUM_DRIVER(4),
  CANCELLATION_BOOST(10);

  private Integer priority;

  DRIVER_PRIORITY_ENUM(Integer priority){
    this.priority = priority;
  }

  public Integer getPriority() {
    return priority;
  }
}
