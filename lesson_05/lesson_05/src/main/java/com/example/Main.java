package com.example;

import com.example.MyArrayList.MyArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {

//    LinkedList<String> linkedList = new LinkedList<>();

//    MyArrayList<Integer> myArrayList = new MyArrayList<>();
//    myArrayList.add(1);
//    myArrayList.add(2);
//    myArrayList.add(3);
//    myArrayList.add(4);
//    myArrayList.add(5);
//    myArrayList.add(6);
//    myArrayList.add(7);
//    for(int i = 0; myArrayList.getSize()>=i;i++){
//      System.out.println(myArrayList.get(i));
//    }
//    System.out.println("------------");
//    myArrayList.remove(1);
//    for(int i = 0; myArrayList.getSize()>=i;i++){
//      System.out.println(myArrayList.get(i));
//    }
//    System.out.println("------------");
//    ArrayList<Integer> arrayList = new ArrayList<>();
//    arrayList.add(11);
//    arrayList.add(12);
//    arrayList.add(13);
//    myArrayList.addAll(arrayList);
//    for(int i = 0; myArrayList.getSize()>=i;i++){
//      System.out.println(myArrayList.get(i));
//    }
//    System.out.println("------------");
//    ArrayList<Integer> arrayList2 = new ArrayList<>();
//    arrayList2.add(22);
//    arrayList2.add(33);
//    arrayList2.add(44);
//    MyArrayList<Integer> myArrayList2 = new MyArrayList<>(arrayList2);
//    for(int i = 0; myArrayList2.getSize()>=i;i++){
//      System.out.println(myArrayList2.get(i));
//    }

//    MyArrayList<Integer> myArrayList3 = new MyArrayList<>();
//    myArrayList3.add(7);
//    myArrayList3.add(6);
//    myArrayList3.add(5);
//    myArrayList3.add(4);
//    myArrayList3.add(3);
//    myArrayList3.add(2);
//    myArrayList3.add(1);
//    for(int i = 0; myArrayList3.getSize()>=i;i++){
//      System.out.println(myArrayList3.get(i));
//    }
//    System.out.println("------------");
//    myArrayList3.sort();
//    for(int i = 0; myArrayList3.getSize()>=i;i++){
//      System.out.println(myArrayList3.get(i));
//    }

    ArrayList<Integer> arrayList4 = new ArrayList<>();
    arrayList4.add(5);
    arrayList4.add(3);
    arrayList4.add(1);
    for(int i = 0; arrayList4.size()>i;i++){
      System.out.println(arrayList4.get(i));
    }
    MyArrayList.staticSort(arrayList4);
        System.out.println("------------");
    for(int i = 0; arrayList4.size()>i;i++){
      System.out.println(arrayList4.get(i));
    }
  }
}