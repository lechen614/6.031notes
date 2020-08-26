import java.util.*;
class Main {
    public static void main(final String[] args) {
        List<String> testImmutableList = List.of("Aa", "Bb", "Cc");
        testImmutableList.set(0, "Dd");
        System.out.println(testImmutableList.get(0));

    }
  }