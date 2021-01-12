package com.agiledeveloper;

public interface Appliance {
  void increase();
  void decrease();
}

//What is good about this design?
//The Remote is extensible
//There is a consistent use of remote across appliances
//We can have multiple Remotes for TV, Fan, etc.

//What is not desirable in this design?
//The TV, Fan, etc. have to conform to an arbitrary interface because they need to support a Remote.
//Methods of an appliance are public methods of TV, Fan, etc. which may not be desirable.
