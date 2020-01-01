
package StacksI;

public interface StackADT {
    public void push(Object o) throws StackFullException;
    public Object pop() throws StackEmptyexception;
    public int size();
    public boolean isEmpty();
    public Object top() throws StackEmptyexception;  
}
