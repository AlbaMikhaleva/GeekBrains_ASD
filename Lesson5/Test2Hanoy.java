package Lesson5;

import java.util.ArrayList;

public class Test2Hanoy {

    private static int disk = 3;
    static ArrayList<Integer> A = new ArrayList<>();
    static ArrayList<Integer> B = new ArrayList<>();
    static ArrayList<Integer> C = new ArrayList<>();


    public static void pushDisk() {
        for (int i = 0; i < disk; i++) {
            A.add(i, i + 1);
            B.add(i, 0);
            C.add(i,0);
        }
    }

//    @Override
//    public String toString(Stack <Integer> S) {
//        Object[] objects = new Object[disk];
//        System.out.println(S.);
//    }


    public static void main(String[] args) {
        pushDisk();
        move(A, B, C, disk);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
    }

    public static void move(ArrayList <Integer> a, ArrayList <Integer> b, ArrayList <Integer> c, int disk) {
        if (disk == 1) {
            System.out.println(a + " ---> " + b);
        } else {
            move(a, c, b, disk - 1);
            int moveDisk = a.get(disk-1);
            a.set(disk-1, 0);
            b.set(disk-1, moveDisk);
            System.out.println(a.toString() + " ---> " + b.toString());
            move(c, b, a, disk - 1);
        }

    }
}

