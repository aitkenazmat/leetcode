package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Run {

  public static void main(String[] args) {


    ArrayList<String> a = new ArrayList<>();
    a.add("a");
    a.add("b");
    a.add("c");

    CategoryWrapper categoryWrapper = new CategoryWrapper(a);


    for (int i = 0; i < 3; i++) {
      categoryWrapper.add();
    }

    a.remove(0);




    System.out.println("1");
  }
  public static void main11(String[] args) {
    // Creating an object of ArrayList Object
    ArrayList<String> arr = new ArrayList<String>();

    arr.add("One");
    arr.add("Two");
    arr.add("Three");
    arr.add("Four");

    try {
      // Printing the elements
      System.out.println("ArrayList: ");
      Iterator<String> iter = arr.iterator();

      while (iter.hasNext()) {
        System.out.print(iter.next() + ", ");
      }

      // No exception is raised as
      // a modification is done
      // after the iteration
      System.out.println(
              "\n\nTrying to add"
                      + " an element in "
                      + "between iteration: "
                      + arr.add("Five"));

      // Printing the elements
      System.out.println(
              "\nUpdated ArrayList: ");
      iter = arr.iterator();

      while (iter.hasNext()) {
        System.out.print(iter.next() + ", ");
      }
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main1(String[] args) {

    // Creating an object of ArrayList Object
    ArrayList<String> arr = new ArrayList<String>();

    arr.add("One");
    arr.add("Two");
    arr.add("Three");
    arr.add("Four");

    try {
      // Printing the elements
      System.out.println("ArrayList: ");
      Iterator<String> iter = arr.iterator();

      while (iter.hasNext()) {

        System.out.print(iter.next() + ", ");

        // ConcurrentModificationException
        // is raised here as an element
        // is added during the iteration
        System.out.println(
                "\n\nTrying to add"
                        + " an element in "
                        + "between iteration\n");
        arr.add("Five");
      }
    }
    catch (Exception e) {
      System.out.println(e);
    }

  }
}
