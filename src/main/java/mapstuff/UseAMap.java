package mapstuff;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseAMap {
  public static void main(String[] args) {
    // build a table:
    // june 24 -> "buy groceries"
    // june 25 -> "have dinner with friends"
    Map<LocalDate, String> calendar = new HashMap<>();
    calendar.put(LocalDate.now(), "buy groceries");
    calendar.put(LocalDate.now().plusDays(1), "have dinner with friends");
    System.out.println(calendar);

    // lookup should be "fast"
    String todo = calendar.get(LocalDate.now());
    System.out.println(todo);

    // Map is not an "Iterable"
    Set<Map.Entry<LocalDate, String>> entries = calendar.entrySet();
//     var entries =
//         calendar.entrySet();
    for (var e : entries) {
      System.out.println("On " + e.getKey() + " " + e.getValue());
    }
  }
}
