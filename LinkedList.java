package DEV120_1_2_Tekiev;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node head;

    public void addElementInBeginning(T data) {   // метод добавляет значение в начало списка

        Node node = new Node();

        node.next = head;

        head = node;

        head.data = data;

    }

    public T getHead() { // метод извлекает значение из начала списка без его удаления из списка

        return head.data;

    }

    public T getHeadAndDelete() { // метод извлекает значение из начала списка с его удалением из списка

        Node tmpHead = head;

        head = head.next;

        return tmpHead.data;

    }

    public void addElementInEnd(T data) {  // метод добавляет значение в конец списка

        Node node = new Node();

        if (head == null) {

            head = node;
            head.data = data;

        } else {

            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
            tmp.next.data = data;
        }

    }

    public T getLast() { // метод извлекает значение из конца списка без его удаления из списка

        Node current = head;

        while (current.next != null) {

            current = current.next;
        }

        return current.data;


    }

    public Node getLastAndDelete() { // метод извлекает значение из конца списка с его удалением из списка


        Node tmpLast;

        Node temp = head;

        Node current = head;


        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;

        tmpLast = current.next;

        current.next = null;

        return tmpLast;

    }

    public String findKey(T key) {   // метод проверяет, содержит ли связанный список заданное значение

        Node current = head;

        while ((current) != null) {

            if (current.data == key) {

                return "Связанный список содержит заданное значение " + key;

            }

            current = current.next;

        }

        return "Связанный список не содержит заданное значение " + key;

    }


    public void printAll() {   // метод печатает все значения связанного списка

        System.out.println("Начало односвязного списка: ");

        Node current = head;
        while ((current) != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println("Конец односвязного списка.");

    }

    public void printBefore(T key) {   // переборка и печать элементов с помощью цикла forEach до определенного

        if (key != null) {
            for (T data : this) {
                if (key != data) {
                    System.out.println(data);
                } else {
                    break;
                }
            }
        }
    }

    public void printAfter(T key) {   // переборка и печать элементов с помощью цикла forEach после определенного если этот элемент есть в списке

        if (key != null) {

            Node current = head;

            while ((current) != null) {

                if (current.data == key) {

                        for (T data : this) {

                            if (data == key){

                                Node tmp = current.next;

                                while ((tmp) != null) {

                                    System.out.println(tmp.data);
                                    tmp = tmp.next;

                                }
                            }
                        }
                }
                current = current.next;
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(head);
    }


    private class MyIterator implements Iterator {             //итератор для перебора всех значений
        private Node current;

        MyIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public class Node {

        T data;

        Node next;

        @Override
        public String toString() {
            return "" + data;
        }
    }

}
