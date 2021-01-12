package com.agiledeveloper;

public class RemoteFactory {
  public static Remote createRemote(Appliance appliance) {
    return new Remote(appliance);
  }
}
