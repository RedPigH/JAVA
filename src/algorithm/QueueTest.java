package algorithm;

import java.util.NoSuchElementException;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.put(1);
        queue.put(2);
        queue.put(3);

        System.out.print(queue.peek());
        queue.remove();
        System.out.print(queue.peek());
        queue.remove();
        System.out.print(queue.peek());
        queue.remove();

    }
}

class Queue<T> {
    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front;
    private Node<T> rear;

    public void put(T Obj) {
        Node<T> t = new Node<T>(Obj);

        if(rear != null) {      // rear가 존재하면 기존 rear의 next 값을 현재 새로 만든 Node로 설정
            rear.next = t;
        }
        rear = t;               // 새 Node를 Queue의 rear로 지정
        if(front == null) {     // fornt가 null이면(Queue가 빈 상태) rear와 front를 같은 Node로 설정
            front = rear;
        }
    }

    public T remove() {
        if(front == null) {     // fornt가 null이면(Queue가 빈 상태) Exception 처리
            throw new NoSuchElementException();
        }

        T data = front.data;
        front = front.next;     // front를 현재 front의 next Node로 설정

        if(front == null) {     // next Node가 null이라면(Queue가 빈 상태) rear Node도 null로 설정
            rear = null;
        }
        return data;
    }

    public T peek() {
        if(front == null) {
            throw new NoSuchElementException();
        }
        return front.data;
    }
}
