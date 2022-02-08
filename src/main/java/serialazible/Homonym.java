package serialazible;

import java.util.*;

public class Homonym {
    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    private static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // однофамилец
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };

    /*
        0 - Harry
        0 - Harry
        1 - Harry
        2 - Harry
        3 - Emily
        4 - Jack
        4 - Jack
        5 - Amelia
        5 - Amelia
        6 - Amelia
        7 - Amelia
        8 - Amelia

        **************************************************

        5 - Amelia (1)
        6 - Amelia (2)
        7 - Amelia (3)
        8 - Amelia (4)
        3 - Emily (1)
        0 - Harry (1)
        1 - Harry (2)
        2 - Harry (3)
        4 - Jack (1)
     */
    public static void main(String[] args) {
        for (Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();

        // todo

        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonIdComparator());
//        Comparator<Person> pcomp = new PersonIdComparator().thenComparing(new PersonNameComparator());
        Set<Person> personSet = new TreeSet<>(pcomp);
        for (Person person : RAW_DATA) {
            personSet.add(person);
        }

        Map<String, List<Integer>> map = new HashMap<>();
        for (Person person : personSet) {
            List<Integer> ids = map.get(person.name);
            if (ids == null) {
                List<Integer> list = new LinkedList<>();
                list.add(person.id );
                map.put(person.name, list);
            } else {
                map.get(person.name).add(person.id );
            }
        }

        for ( Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            String name = entry.getKey();
            List<Integer> integers = map.get(name);
            int count = 1;
            for ( Integer id : integers) {
                System.out.println(id + " - " + name + " ("+count+")" );
                count++;
            }
        }
    }
}
