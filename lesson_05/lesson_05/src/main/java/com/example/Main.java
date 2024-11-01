package com.example;

import com.example.MyArrayList.MyArrayList;
import com.example.MyLinkedList.MyLinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
//  Создание и распечатка MyArrayList, добавление позиций (отсчёт позиций от 0)
    System.out.println("Создание и распечатка MyArrayList, добавление позиций (отсчёт позиций от 0)");
    MyArrayList<Number> myArrayList = new MyArrayList<>();
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    for(int i = 0;myArrayList.getSize()>=i;i++){
      System.out.println(myArrayList.get(i));
    }

//   Создание и распечатка MyArrayList на основании ArrayList
    System.out.println("Создание и распечатка MyArrayList на основании ArrayList");
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(11);
    arrayList.add(22);
    arrayList.add(33);
    MyArrayList<Number> myArrayList2 = new MyArrayList<>(arrayList);
    for(int i = 0;myArrayList2.getSize()>=i;i++){
      System.out.println(myArrayList2.get(i));
    }
//    Удаление позиций из MyArrayList
    System.out.println("Удаление позиций из MyArrayList, удаляем позицию 2");
    myArrayList2.remove(2);
    for(int i = 0;myArrayList2.getSize()>=i;i++){
      System.out.println(myArrayList2.get(i));
    }

//    Локальная сортировка в MyArrayList
    System.out.println("Локальная сортировка в MyArrayList");
    MyArrayList<Number> myArrayList3 = new MyArrayList<>();
    myArrayList3.add(31);
    myArrayList3.add(22);
    myArrayList3.add(13);
    System.out.println("Было");
    for(int i = 0;myArrayList3.getSize()>=i;i++){
      System.out.println(myArrayList3.get(i));
    }
    System.out.println("Стало");
    myArrayList3.sort();
    for(int i = 0;myArrayList3.getSize()>=i;i++){
      System.out.println(myArrayList3.get(i));
    }
//    Повторный вызов сортировки приводит к ошибке
    System.out.println("Повторный вызов сортировки приводит к ошибке");
    myArrayList3.sort();

//    После добавления позиции сортировка снова возможна, добавляем 11 и сортируем
    System.out.println("После добавления позиции сортировка снова возможна, добавляем 11 и сортируем");
    myArrayList3.add(11);
    myArrayList3.sort();
    for(int i = 0;myArrayList3.getSize()>=i;i++){
      System.out.println(myArrayList3.get(i));
    }

//-------------------------------------------------
    System.out.println("-------------------------------------------------");
    //  Создание и распечатка MyLinkedList, добавление позиций (отсчёт позиций от 0)
    System.out.println("Создание и распечатка MyLinkedList, добавление позиций (отсчёт позиций от 0)");
    MyLinkedList<Number> myLinkedList = new MyLinkedList<>();
    myLinkedList.add(1);
    myLinkedList.add(2);
    myLinkedList.add(3);
    for(int i = 0;myLinkedList.getSize()>i;i++){
      System.out.println(myLinkedList.get(i));
    }

//   Создание и распечатка MyLinkedList на основании ArrayList
    System.out.println("Создание и распечатка MyLinkedList на основании ArrayList");
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    arrayList1.add(11);
    arrayList1.add(22);
    arrayList1.add(33);
    MyArrayList<Number> myLinkedList2 = new MyArrayList<>(arrayList1);
    for(int i = 0;myLinkedList2.getSize()>=i;i++){
      System.out.println(myLinkedList2.get(i));
    }
//    Удаление позиций из MyLinkedList
    System.out.println("Удаление позиций из MyLinkedList, удаляем позицию 2");
    myLinkedList2.remove(2);
    for(int i = 0;myLinkedList2.getSize()>=i;i++){
      System.out.println(myLinkedList2.get(i));
    }

//    Локальная сортировка в MyLinkedList
    System.out.println("Локальная сортировка в MyLinkedList");
    MyArrayList<Number> myLinkedList3 = new MyArrayList<>();
    myLinkedList3.add(31);
    myLinkedList3.add(22);
    myLinkedList3.add(13);
    System.out.println("Было");
    for(int i = 0;myLinkedList3.getSize()>=i;i++){
      System.out.println(myLinkedList3.get(i));
    }
    System.out.println("Стало");
    myLinkedList3.sort();
    for(int i = 0;myArrayList3.getSize()>=i;i++){
      System.out.println(myArrayList3.get(i));
    }
//    Повторный вызов сортировки приводит к ошибке
    System.out.println("Повторный вызов сортировки приводит к ошибке");
    myLinkedList3.sort();

//    После добавления позиции сортировка снова возможна, добавляем 11 и сортируем
    System.out.println("После добавления позиции сортировка снова возможна, добавляем 11 и сортируем");
    myLinkedList3.add(11);
    myLinkedList3.sort();
    for(int i = 0;myLinkedList3.getSize()>=i;i++){
      System.out.println(myLinkedList3.get(i));
    }

//-------------------------------------------------
    System.out.println("-------------------------------------------------");
//    Статическая сортировка
    System.out.println("Статическая сортировка");
    LinkedList<Integer> linkedListToSort = new LinkedList<>();
    linkedListToSort.add(9);
    linkedListToSort.add(6);
    linkedListToSort.add(3);
    System.out.println("Было");
    for(int i = 0;linkedListToSort.size()>i;i++){
      System.out.println(linkedListToSort.get(i));
    }
    MyArrayList.staticSort(linkedListToSort);
    System.out.println("Стало");
    for(int i = 0;linkedListToSort.size()>i;i++){
      System.out.println(linkedListToSort.get(i));
    }
  }
}