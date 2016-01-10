package com.wrox.programming.LinkedList;

/**
 * Created by brajakumar on 1/10/16.
 */
public class Stack {
    private ListElement head;
    public void pushToStack(ListElement element) {
        //base case : when stack is empty
        if(head == null) {
            head = element;
        } else {
            element.setNext(head);
            head = element;
        }
    }

    public ListElement popFromStack() {
        ListElement<Integer> poppedElement = head;
        if(head == null) {
            try {
                throw new Exception("Stack is empty !!! Can't perform pop operation !!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        head = head.getNext();
        return poppedElement;
    }

    public ListElement peek() {
        return head;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        //add elements to stack
        ListElement<Integer> a = new ListElement<>(2);
        ListElement<Integer> b = new ListElement<>(4);
        myStack.pushToStack(a);
        System.out.println("top element : " + myStack.peek().value());
        myStack.pushToStack(b);
        System.out.println("top element : " + myStack.peek().value());
        System.out.println("popping from stack : " + myStack.popFromStack().value());
        System.out.println("top element : " + myStack.peek().value());
        System.out.println("popping from stack : " + myStack.popFromStack().value());
        System.out.println("popping from stack : " + myStack.popFromStack().value());
    }
}
