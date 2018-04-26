package com.example.ArrayListHashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyMap<K, V> {
  private int size=0;
  private MyEntry<K, V>[] arr = new MyEntry[16];


  public V get(K key) {
    for (int i = 0; i < size; i++) {
      if (arr[i] != null) {
        if (arr[i].getKey().equals(key)) {
          return arr[i].getValue();
        }
      }
    }
    return null;
  }

  public void put(K key, V value) {
    boolean insert = true;
    for (int i = 0; i < size; i++) {
      if (arr[i].getKey().equals(key)) {
        arr[i].setValue(value);
        insert = false;
      }
    }
    if (insert) {
      ensureCapa();
      arr[size++] = new MyEntry<K, V>(key, value);
    }
  }

  private void ensureCapa() {
    if (size == arr.length) {
      arr = Arrays.copyOf(arr, arr.length * 2);
    }
  }

  public int size() {
    return size;
  }

  public void remove(K key) {
    for (int i = 0; i < size; i++) {
      if (arr[i].getKey().equals(key)) {
        arr[i] = null;
        size--;
        condenseArray(i);
      }
    }
  }

  private void condenseArray(int start) {
    for (int i = start; i < size; i++) {
      arr[i] = arr[i + 1];
    }
  }

  public Set<K> keySet() {
    Set<K> set = new HashSet<K>();
    for (int i = 0; i < size; i++) {
      set.add(arr[i].getKey());
    }
    return set;
  }
} 