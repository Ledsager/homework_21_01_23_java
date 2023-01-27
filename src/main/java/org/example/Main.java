package org.example;

public class Main {
    public static void main(String[] args) {

//        System.out.println("добавление в конец списка");
        NodeList<String> list1 = new NodeList<>();
        list1.addElem("sdfdsf");
        list1.addElem("kj");
        list1.addElem("dsf");
        System.out.println(list1);
        System.out.println(list1.getSize());
        list1.addElem("wedsf");
        list1.addElem("123");
//        Scanner scn = new Scanner(System.in);
//        System.out.println("введите количество вводимых элементов->");
//        int n = scn.nextInt();
//        System.out.print("введите элементы через Enter");
//        while (n-->0){
//            System.out.println(n);
//            list1.addLast(scn.nextLine());
//        }

        System.out.println(list1);
        System.out.println("The Size of linked list is="+list1.getSize());

//        System.out.println("-----------------------------------");
//        System.out.println("добавление в начало списка");
//        list1 = new NodeLinkedClass<>();
//        System.out.println("введите количество вводимых элементов->");
//        int n1 = scn.nextInt();
//        System.out.println("введите элементы через Enter");
//        while (n1-->0){
//            list1.addFirst(scn.nextLine());
//        }
//
//        System.out.println(list1);
//        System.out.println("The Size of linked list is="+list1.getSize());
    }

}
