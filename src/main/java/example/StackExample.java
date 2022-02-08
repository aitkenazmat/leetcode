package example;

import java.util.Stack;


/**
 *
 * push - добавляет элемент вверх стэка
 * peek - достает элемнет из вершины стэка
 * pop - удаляет верхний элемент из стэка
 * empty - проверяет на пустоту (лучше использовать вместе с peek)
 *
 *
 * */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Integer peek = stack.peek();//4
        stack.pop();//remove 4

        System.out.println(stack);
    }
}
