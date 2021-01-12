package com.agiledeveloper;

public class Car {
  private final int year; //please keep this final
  private final Engine engine; //please keep this final

  public Car(int theYear, Engine theEngine) {
    year = theYear;
    engine = theEngine;
  }

  protected Car(Car other) {
//    year = other.year;
//
//    //this fails OCP
//    if(other.engine instanceof TurboEngine) {
//      engine = new TurboEngine((TurboEngine)(other.getEngine()));
//    } else {
//      engine = new PistonEngine((PistonEngine) (other.getEngine()));
//    }

    year = other.year;
    engine = other.engine.clone(); //this no longer violates the OCP
  }

  public Car clone() {
    return new Car(this);
  }

  public static Car copyCar(Car car) {
    return car.clone();
  }

  public int getYear() { return year; }
  public Engine getEngine() { return engine; }
}