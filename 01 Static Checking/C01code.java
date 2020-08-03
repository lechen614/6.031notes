import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double sum = 7;
        double n = 0;
        double average = sum/n;
        System.out.println(average);
        // Output Infinity
        // For python, a dynamic error will appear

        final List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        System.out.println(list);
        // final keyword, it is mutable, but can't be reassigned
    }
  }