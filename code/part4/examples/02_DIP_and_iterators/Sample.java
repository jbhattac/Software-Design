import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3);

    Iterator<Integer> iterator = numbers.iterator();

    System.out.println(iterator);

    Set<Integer> set = new HashSet<>();

    System.out.println(set.iterator());
  }
}
