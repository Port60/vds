package com.port60.vehicledispatcher.model;

public enum SHIFT_FLEXIBILITY {


  STRICT(0), // Do not assign anything outside of shift time
  RELAXED(0), // assign outside of shift time
  HYBRID(60); // assign outside of shift time for a period of time in minutes

  private int timeFrame;

  SHIFT_FLEXIBILITY(int timeFrame){
    this.timeFrame = timeFrame;
  }

  public int getTimeFrame() {
    return timeFrame;
  }
}
