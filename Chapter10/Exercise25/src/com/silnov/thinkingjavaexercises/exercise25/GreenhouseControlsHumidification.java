package com.silnov.thinkingjavaexercises.exercise25;
import  com.silnov.thinkingjavaexercises.exercise25.controller.*;

public class GreenhouseControlsHumidification extends GreenhouseControls {
  private boolean waterMis = false;
  public class WaterMisOn extends Event {
    public WaterMisOn(long delayTime) {
      super(delayTime);
    }
    @Override
    public void action() {
      // Put hardware control code here to
      // physically turn on the waterMis.
      waterMis = true;
    }
    @Override
    public String toString() {
      return "WaterMis is on";
    }
  }
  public class WaterMisOff extends Event {
    public WaterMisOff(long delayTime) {
      super(delayTime);
    }
    @Override
    public void action() {
      // Put hardware control code here to
      // physically turn off the waterMis.
      waterMis = false;
    }
    @Override
    public String toString() {
      return "WaterMis is off";
    }
  }
}