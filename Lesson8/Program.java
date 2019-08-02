package Lesson8;

public class Program {
    public static void main(String[] args) {
        MyChainingHashMap<Character, Integer> hashMap = new MyChainingHashMap<>();
        hashMap.put('s', 1);
        hashMap.put('e', 1);
        hashMap.put('c', 1);
        hashMap.put('r', 1);
        hashMap.put('c', 5);
    }
}
