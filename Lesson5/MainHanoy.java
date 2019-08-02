package Lesson5;


public class MainHanoy {


    public static void main(String[] args) {
        int disk = 3 ;
        move('A', 'B', 'C', disk);

    }

    public static void move(char a, char b, char c, int disk) {
        if (disk == 1) {
            System.out.println(a + " ---> " + b);
        } else {
            move(a, c, b, disk - 1);
            System.out.println(a + " ---> " + b);
            move(c, b, a, disk - 1);
        }

    }
}

