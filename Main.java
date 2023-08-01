package DEV120_1_2_Tekiev;

public class Main {

    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList<>();

        list.addElementInBeginning(3);

        System.out.println(list.findKey(4));

        System.out.println(list.findKey(3));

        list.printAll();

        list.addElementInBeginning(2);

        list.printAll();

        list.addElementInBeginning(1);

        list.printAll();

        list.addElementInEnd(4);

        list.printAll();

        list.addElementInBeginning(0);

        list.printAll();

        list.addElementInEnd(5);

        list.addElementInEnd(6);

        list.printAll();

        LinkedList <String> listString = new LinkedList<>();

        listString.addElementInBeginning("c");

        System.out.println(listString.findKey("X"));

        System.out.println(listString.findKey("c"));

        listString.printAll();

        listString.addElementInBeginning("b");

        listString.printAll();

        listString.addElementInBeginning("a");

        listString.printAll();

        for(Integer data : list){                      // переборка и печать всех элементов списка
            System.out.println(data);
        }

        for(String data : listString){
            System.out.println(data);
        }

        list.printBefore(5);

        listString.printBefore("c");

        list.printAfter(2);

    }

}
