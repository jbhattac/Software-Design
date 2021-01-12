package com.agiledeveloper;

public class PistonEngine extends Engine {
  public PistonEngine() { super(); }
  protected PistonEngine(PistonEngine other) { super(other); }

  //new is not polymorphic
  //clone is polymorphic and in it we dispatch call to the copy constructor

  public PistonEngine clone() {
    return new PistonEngine(this);
  }
}
