package com.wrox.programming.LinkedList;

/**
 * Created by brajakumar on 1/9/16.
 */
//template class for Singly linked list
public class ListElement<T> {
    private ListElement<T> next;
    private T data;

    public ListElement(T value) {
        data = value;
    }

    public T value() {
        return data;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> element) {
        next = element;
    }

    public void setData(T value) {
        data = value;
    }

    public ListElement<T> insertInFront(ListElement<T> element, T data) {
        ListElement<T> list = new ListElement<>(data);
        list.setNext(element);
        return list;
    }

    public ListElement<T> findElement(ListElement<T> head, T dataToFind) {
        ListElement<T> currentElement = head;
        while(currentElement != null) {
            if(currentElement.value() == dataToFind) {
                return currentElement;
            } else {
                currentElement = currentElement.getNext();
            }
        }

        return null;
    }


}
