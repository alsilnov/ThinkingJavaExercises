package com.silnov.thinkingjavaexercises.exercise25;
import  com.silnov.thinkingjavaexercises.exercise25.controller.*;

public class GreenhouseController {
  public static void main(String[] args) {
    GreenhouseControls gc = new GreenhouseControls();
    // Instead of using code, you could parse
    // configuration information from a text file:
    GreenhouseControlsHumidification gch = new GreenhouseControlsHumidification();
    gc.addEvent(gc.new Bell(900));
    Event[] eventList = {
      gc.new ThermostatNight(0),
      gc.new FanOn(100),
      gc.new LightOn(200),
      gc.new LightOff(400),
      gc.new WaterOn(600),
      gch.new WaterMisOn(650),
      gch.new WaterMisOff(750), 
      gc.new WaterOff(800),
      gc.new ThermostatDay(1400),
      gc.new FanOff(1600),
    };
    gc.addEvent(gc.new Restart(2000, eventList));
    gc.addEvent(
      new GreenhouseControls.Terminate(5000));
    gc.run();
  }
}