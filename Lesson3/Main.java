package Lesson3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }*/
       /* MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue);
        System.out.println(queue.peekFront());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);

    }*/
        /*MyDeque<Character> deque = new MyDeque<>();
        deque.insertRight('a');
        deque.insertLeft('b');
        deque.insertLeft('c');
        deque.insertRight('d');
        deque.insertRight('e');
        deque.insertLeft('f');
        deque.insertRight('g');
        System.out.println(deque);
        deque.removeLeft();
        deque.removeLeft();
        System.out.println(deque);
        deque.removeRight();
        System.out.println(deque);
        System.out.println();

        // как стек
        deque.insertLeft('h');
        deque.insertLeft('i');
        System.out.println(deque.removeLeft());
        System.out.println(deque);
        System.out.println();

        //как очередь
        deque.insertLeft('j');
        System.out.println(deque.removeRight());
        System.out.println(deque);

    }*/

        ReadString str = new ReadString();

        String word = str.write();
        char[] arrayChar = new char[1];
        arrayChar = str.strToArray(word);

        MyStack <Character> stackWord = new MyStack<>();
        for (int i = arrayChar.length-1; i >= 0 ; i--) {
            stackWord.push(arrayChar[i]);
        }
        System.out.println(stackWord);
    }


}