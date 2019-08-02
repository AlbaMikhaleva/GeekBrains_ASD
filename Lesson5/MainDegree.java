package Lesson5;

public class MainDegree {
    public static void main(String[] args) {

        System.out.println("Рекурсия " + degreeRec(3, 1));
        System.out.println("Цикл " + degree(3,1));

    }

    public static int degreeRec(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else if (b == 0) {
            return 1;
        } else {
            return degreeRec(a, b - 1) * a;
        }
    }

    public static int degree(int a, int b) {
        int res = 1;
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            while (b > 0) {
                res *= a;
                b--;
            }
            return res;
        }
    }
}
