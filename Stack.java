  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StacksI;

/**
 *
 * @author kanaporn1
 */
public class Stack implements StackADT {
    private Object[] stackArray;
    private int top;
    
     public Stack(int maxSize) {
        stackArray = new Object[maxSize];
        top = -1;
    }
    public Stack() {
        this(100); //maxsize = 100 by default
    }
    public boolean isEmpty() {
        return (size()==0);
    }
    public void push (Object o) throws StackFullException {
        if (size() == stackArray.length){
            throw new StackFullException("Stack is full");
        }
        stackArray[++top] = o;
    }
    public int size() {
        return top+1;
    }
    public Object pop() throws StackEmptyexception {
        if (isEmpty()) {
            throw new StackEmptyexception("Stack is Empty");
        }
        return stackArray[top--];
    }
    public Object top() throws StackEmptyexception{
        if (isEmpty()) {
            throw new StackEmptyexception("Stack is Empty");
        }
        return stackArray[top];
    }
    
}
