/**
 * Hello world
 *
 */
import java.util.*;

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("wocao World!");
    System.out.println("wocao World!");
    Map<String, String> envVars = System.getenv();
    for (Map.Entry<String, String> entry : envVars.entrySet()) {
        String key = entry.getKey();
        String value = entry.getValue();
        System.out.println(key + " : " + value);
    }
  }

}
