package com.company.phone;

public class MyVector<T> {

    private Object[] arr;
    private int size = 0;
    private int capacity = 5;

    public MyVector() {
        this.arr = new Object[capacity];
    }


    public void addSubscriber(T subscriber) {
        if (size >= capacity - 1) {
            capacity *= capacity;
            Object[] buf = new Object[capacity];
            for (int i = 0; i < arr.length; i++) {
                buf[i] = arr[i];
            }
            arr = buf;
        }
        arr[size] = subscriber;
        size++;
    }

    public void addMessages(T message) {
        if (size >= capacity - 1) {
            capacity *= capacity;
            Object[] buf = new Object[capacity];
            for (int i = 0; i < arr.length; i++) {
                buf[i] = arr[i];
            }
            arr = buf;
        }
        arr[size] = message;
        size++;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int size() {
        return this.size;
    }

}
