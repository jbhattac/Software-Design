import java.util.*;

class Base {
  public void f1() {}
  public int f2() { return 0; }
}

class Derived {
  private Base delegate;

  public void f1() {
    delegate.f1();
  }

  public int f2() {
    return delegate.f2();
  }
}

public class Sample {  
  public static void main(String[] args) {
    //Good news.
    //The code does not violate LSP
    //The users of the code are not affect by this.

    //Bad news.
    //The code violates both DRY and OCP.
    //if we modify the Base we have to change the Derived
    //we are routing the calls in Derived and that is duplicated effort


    //What is the answer. 
    //1. It is better for us to violate OCP and DRY rather than
    //violating LSP and then the users of our class violating OCP.

    //2. But, it will be better if we don't have to violate anything.
    //We may use Project Lombok or look into languages like Groovy
    //or Kotlin.

  }
}
