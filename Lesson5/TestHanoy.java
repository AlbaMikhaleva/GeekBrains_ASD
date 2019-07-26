package Lesson5;

import java.util.Stack;

public class TestHanoy {

    public static void main(String[] args) {

        Stack<Integer> towerA = new Stack<>();
        Stack<Integer> towerB = new Stack<>();
        Stack<Integer> towerC = new Stack<>();

        towerA.push(3);
        towerA.push(2);
        towerA.push(1);
        towerA.pop();
        towerB.push(1);
        towerA.pop();
        towerC.push(2);
        towerB.pop();
        towerC.push(1);
        towerA.pop();
        towerB.push(3);
        towerC.pop();
        towerA.push(1);
        towerC.pop();
        towerB.push(2);
        towerA.pop();
        towerB.push(1);
        System.out.println(towerA.toString());
        System.out.println(towerB.toString());
        System.out.println(towerC.toString());

    }
}
