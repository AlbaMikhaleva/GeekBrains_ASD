package Lesson6;

import Lesson6.MyTreeMap;

import java.util.Random;


public class Program {


    public static void main(String[] args) {
     MyTreeMap <Integer, Integer> [] treeMaps = new MyTreeMap[2];
        for (int i = 1; i <= 2 ; i++) {
            do {
                treeMaps[i] = new MyTreeMap<>();
                Random rand = new Random();
                int randValue = rand.nextInt((100 - (-100)) + 1) + (-100);
                treeMaps[i].put(randValue, randValue);
            }
            while (treeMaps[i].height()<=6);
            }
        for (int i = 1; i <=2 ; i++) {
            System.out.println("Размер дерева " + i + ":" + treeMaps[i].size());
            System.out.println("Высота дерева " + i + ":" + treeMaps[i].height());
        }
        }


    }

