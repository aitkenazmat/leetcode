package algorithms.string;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {

        List<String> list = new LinkedList<>();
        List<Integer> listInt = new LinkedList<>();
        for (int i = 0; i < n ; i++) {
            listInt.add(i+1);

        }

        for (int i = 0; i < listInt.size(); i++) {
            if ( listInt.get(i) % 3 == 0 && listInt.get(i) % 5 == 0) {
                list.add("FizzBuzz");
            }
            else if (listInt.get(i) % 3 == 0) {
                list.add("Fizz");
            }

            else if (listInt.get(i) % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(listInt.get(i)));
            }
        }

        return list;
    }
}
