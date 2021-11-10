package algorithms.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NumberofStudentsUnabletoEatLunch {
    public static void main(String[] args) {

//        int[]students = new int[]{1,1,0,0};
//        int[]sandwiches = new int[]{0,1,0,1};

        int[]students = new int[]{1,1,1,0,0,1};
        int[]sandwiches = new int[]{1,0,0,0,1,1};

        System.out.println(countStudents(students, sandwiches));
    }


    public static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwichesStack = new Stack<>();
        for (int i = sandwiches.length-1; i >=0 ; i--) {
            sandwichesStack.push(sandwiches[i]);
        }

        List<Integer> studentList  = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            studentList.add(students[i]);
        }


        doSomething(studentList, sandwichesStack);






        return sandwichesStack.size();
    }


    private static void doSomething( List<Integer> studentList  , Stack<Integer> sandwichesStack  ){
        for (int i = 0; i < studentList.size(); i++) {
            if (!sandwichesStack.empty()) {
                Integer peek = sandwichesStack.peek();
                int i1 = studentList.indexOf(peek);
                if (i1!=-1) {
                    studentList.remove(i1);
                    sandwichesStack.pop();
                    doSomething(studentList, sandwichesStack);
                }
            }
        }
    }
}
