package com.example.MyArrayList;

import java.util.Collection;
import java.util.List;

public class MyArrayList<T> {
  T[] elementData;
  private static final int DEFAULT_CAPACITY = 5;
  private int size;
  private int lastInsertedPosition = -1;
  T[] elementTemporalCopy;
  boolean isSorted = false;

  public MyArrayList(){
    this.elementData = (T[]) new Object[DEFAULT_CAPACITY];
    size = DEFAULT_CAPACITY;
  }

  public MyArrayList(int sizeForCreation){
    if(sizeForCreation >=0){
      this.elementData = (T[]) new Object[sizeForCreation];
      this.size = sizeForCreation;
    }else{
      System.out.println("Указан некорректный размер массива.");
    }
  }

  public void add(T t){
    lastInsertedPosition++;
    if(lastInsertedPosition>size-1){
      increaseSize();
    }
    isSorted = false;
    elementData[lastInsertedPosition]= t;
  }

  public void addAll(Collection<? extends T> c){
    isSorted = false;
    for (T position : c) {
      this.add(position);
    }
  }

  private void increaseSize(){
    int newSize = size + size/2;
    elementTemporalCopy = (T[]) new Object[newSize];
    System.arraycopy(elementData, 0, elementTemporalCopy, 0, size);
    elementData = (T[]) new Object[newSize];
    System.arraycopy(elementTemporalCopy, 0, elementData, 0, size);
    size = newSize;
  }

  public T get(int i){
    if(i>lastInsertedPosition){
      System.out.println("Указан некорректный индекс элемента.");
      return null;
    }else{
      return (T) elementData[i];
    }
  }

  public void remove(int i){
    if(i>lastInsertedPosition){
      System.out.println("Указан некорректный индекс элемента.");
    }else{
      System.arraycopy(elementData, i + 1, elementData, i, lastInsertedPosition-i);
      elementData[lastInsertedPosition]=null;
      lastInsertedPosition=lastInsertedPosition-1;
    }
  }

  public int getSize(){
    if(lastInsertedPosition<0){
      return 0;
    }else{
      return lastInsertedPosition;
    }
  }

  public MyArrayList(Collection<? extends T> c){
    this.elementData = (T[]) new Object[c.size()];
    this.size = c.size();
    for (T position : c) {
      this.add(position);
    }
  }

  public <E extends Comparable<E>> void sort(){
    if(!isSorted){
      for(int i = 0;lastInsertedPosition>=i;i++){
        for(int y = 0;lastInsertedPosition>=y;y++){
          if(this.compare((E) elementData[i], (E) elementData[y]) < 0){
            T x = (T) elementData[i];
            T z = (T) elementData[y];
            elementData[i] = z;
            elementData[y] = x;
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

  public static <E extends Comparable<E>> void staticSort(List<E> l){
    for(int i = 0;l.size()>i;i++){
      for(int y = 0;l.size()>y;y++){
        if(staticCompare(l.get(i), l.get(y)) < 0){
          E x = l.get(i);
          E z = l.get(y);
          l.set(i, z);
          l.set(y, x);
        }
      }
    }
  }

  private static <E extends Comparable<E>> int staticCompare(E e1, E e2) {
    return e1.compareTo(e2);
  }
}
