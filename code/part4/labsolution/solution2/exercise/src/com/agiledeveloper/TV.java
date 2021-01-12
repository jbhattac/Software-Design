package com.agiledeveloper;

public class TV {
  private int volume = 1;

  public int getVolume() {
    return volume;
  }

  public void setVolume(int value) {
    volume = value;
  }

  public Remote getRemote() {
    return new Remote() {
      public void up() {
        setVolume(getVolume() + 1);
      }

      public void down() {
        setVolume(getVolume() - 1);
      }
    };
  }
}

//What is good about this design?
//The Remote is extensible and is an interface rather than a class (loose couping to the user)
//We can have multiple Remotes for TV, Fan, etc.
//Each appliance can implement the remote differently with greater efficiency
//TV, Fan, etc. do not conform to some arbitrary interface
//Method needed for Remote do not have to be public

//What is not desirable in this design?
//There is no consistent way to get a remote from different appliances
