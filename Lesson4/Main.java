package Lesson4;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Character> linkedList = new MyLinkedList<>();
        linkedList.addLast('a');
        linkedList.addLast('b');
        linkedList.addLast('c');
        linkedList.addFirst('e');
        System.out.println(linkedList);
        linkedList.addFirst('d');
        linkedList.addLast('f');
        linkedList.add(2, 'g');
        System.out.println(linkedList);
        linkedList.removeLast();
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf('z'));
        System.out.println(linkedList.indexOf('g'));
        System.out.println(linkedList.size());
        linkedList.remove('c');
        //System.out.println(linkedList);
        for (Character c:
                linkedList) {
            System.out.print(c + ", ");
        }
        System.out.println();
        System.out.println("________________________________");
        linkedList.addFirst('h');
        linkedList.addFirst('i');
        linkedList.addFirst('j');
        linkedList.addFirst('k');
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(3));
        linkedList.set(5, 'z');
        System.out.println(linkedList);

    }
}
