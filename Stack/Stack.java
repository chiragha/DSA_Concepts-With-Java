
package dsa_with.java;

import java.io.PushbackReader;
import java.util.EmptyStackException;

public class Stack {
    
    private ListNode top;
    private int length;
    
    private class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
          this.data = data;
        }
    }
    
    public Stack(){
        top = null;
        length = 0;
    }
    
    public int length(){
        return length;
    }
    
    public boolean isEmpty(){
       return length == 0;
    }
    
    //PUSH ELEMENTS IN A STACK USING A LINKED LIST
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    
     //POP ELEMENTS IN A STACK USING A LINKED LIST
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    
     //PEEK ELEMENTS IN A STACK USING A LINKED LIST
    public int peek(){
         if(isEmpty()){
            throw new EmptyStackException();
        }
         return top.data;
    }
    
     public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(60);
        stack.push(80);
        
         System.out.println(stack.peek()); //based on LIFO---- 80
         stack.pop(); //80 DELETED
          System.out.println(stack.peek()); // 60
      }
}
