import java.util.*;
// import java.util.List;

class Main {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<> ();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        
        List<String> list2 = Collections.unmodifiableList(list1);
        
        System.out.println(list1);
        System.out.println(list2);
        list1.add("d");
        // list2 cannot be modified
        // list2.add("d"); 

        System.out.println(list2); // list2 is modified since it is a alias of list1

    }
  }