package com.example.MyLinkedList;

import java.util.Collection;

public class MyLinkedList<T> {
  private int lastInsertedPosition = 0;
  boolean isSorted = false;
  Node<T> firstNode = null;
  Node<T> beforeLastNode = null;
  Node<T> lastNode = null;

  private static class Node<T> {
    T item;
    MyLinkedList.Node<T> next;
    MyLinkedList.Node<T> prev;

    Node(MyLinkedList.Node<T> prev, T element, MyLinkedList.Node<T> next) {
      this.item = element;
      this.next = next;
      this.prev = prev;
    }
  }

  public MyLinkedList(){
  }

  public void add(T t){
    isSorted = false;
    lastInsertedPosition++;
    Node<T> node = new Node<>(lastNode, t, null);
    beforeLastNode = lastNode;
    lastNode = node;
    if(lastInsertedPosition==1){
      firstNode = lastNode;
      firstNode.prev = lastNode;
    }else{
      beforeLastNode.next=lastNode;
    }
  }

  public void addAll(Collection<? extends T> c){
    isSorted = false;
    for (T position : c) {
      this.add(position);
    }
  }

  public T get(int i){
    if(i<=lastInsertedPosition){
      Node<T> localNode = firstNode;
      int m = 0;
      while(m!=i)
      {
        m++;
        localNode = localNode.next;
      }
      return localNode.item;
    }else{
      System.out.println("Указан некорректный индекс позиции");
      return null;
    }
  }

  private Node<T> getNode(int i){
    if(i==1){
      return firstNode;
    }else if(i==lastInsertedPosition){
      return lastNode;
    }else if(i<lastInsertedPosition){
      Node<T> localNode = firstNode;
      int m = 1;
      if(i>1){
        while(m!=i)
        {
          m++;
          localNode = localNode.next;
        }
      }
      return localNode;
    }else{
      System.out.println("Указан некорректный индекс позиции getNode");
      return null;
    }
  }

  public void remove(int i){
    if(i < lastInsertedPosition && i!=1) {
      Node<T> localNode1 = getNode(i - 1);
      Node<T> localNode2 = getNode(i + 1);
      localNode1.next = localNode2;
      lastInsertedPosition--;
    } else if(i==1){
      firstNode = getNode(i+1);
      firstNode.prev = null;
      lastInsertedPosition--;
    }else if(i==lastInsertedPosition){
      lastNode = getNode(i-1);
      lastNode.next = null;
      lastInsertedPosition--;
    }else{
      System.out.println("Указан некорректный индекс позиции");
    }
  }

  public int getSize(){
    if(lastInsertedPosition<0){
      return 0;
    }else{
      return lastInsertedPosition;
    }
  }

  public MyLinkedList(Collection<? extends T> c){
    for (T position : c) {
      this.add(position);
    }
  }

  public <E extends Comparable<E>> void sort(){
    if(!isSorted){
      for(int i = 0;lastInsertedPosition>=i;i++){
        for(int y = 0;lastInsertedPosition>=y;y++){
          if(this.compare((E) getNode(i).item, (E) getNode(y).item) < 0){
            Node<T> localNode1 = getNode(i);
            Node<T> localNode2 = getNode(y);
            E itemValue1 = (E) localNode1.item;
            E itemValue2 = (E) localNode2.item;
            localNode1.item = (T) itemValue2;
            localNode2.item = (T) itemValue1;
          }
        }
      }
      isSorted = true;
    }else{
      System.out.println("Сортировка уже выполнена.");
    }
  }

  private <E extends Comparable<E>> int compare(E e1, E e2) {
    return e1.compareTo(e2);
  }
}
