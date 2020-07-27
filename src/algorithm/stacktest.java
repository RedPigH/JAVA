package algorithm;

import java.util.EmptyStackException;
import java.util.Scanner;

public class stacktest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*String input = s.nextLine();*/
        String input2 = "{(A+B)*C}+{(D+E)*(F+G)}";
        isTrue(input2);
    }

    public static void isTrue(String s) {
        Stack stack = new Stack();
        boolean istrue = true;

        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (c == '{' || c == '(') {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty()) {
                if((char)stack.peek() == '{') stack.pop();
                else{
                    istrue = false;
                    break;
                }

            } else if (c == ')' && !stack.isEmpty() ) {
                if((char)stack.peek() == '(') stack.pop();
                else{
                    istrue = false;
                    break;
                }
            }
        }
        if (stack.isEmpty() && istrue)
            System.out.println("true");
        else System.out.println("false");

    }
}

class Stack<T>{
    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop() {
        if(top == null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if(top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
