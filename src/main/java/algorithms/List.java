package algorithms;


import java.util.LinkedList;

/*
*
* slowly
*
* */
public class List {

    public static void main(String[] args) {

        java.util.List<String> list = new LinkedList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.add(1,"aa");
        list.add(1,"aa");

        for ( String str : list ) {
            System.out.println(str);
        }
    }
}
