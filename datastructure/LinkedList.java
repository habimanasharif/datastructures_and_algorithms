/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author ICT Admin
 */
public class MyLinkedList {
     Node head;
   Node tail;
   int size;
    class Node{
  int data;
  Node next;
   public Node(){
        next=null;
    }
   public Node (int a){
       data=a;
       next=null;
   }
  
   
   
   
    }
    public MyLinkedList(){
        head =null;
        tail= null;
        size=0;
    }
   public MyLinkedList(int a){
   Node newNode = new Node(a);
   head =newNode;
   tail=newNode;
   size=1;
   }
   public int size(){
       return size;
   }
   public boolean isEmpty(){
       return size()==0;
   }
   
   public void insertAFront(int a){
       Node newNode = new Node(a);
       if(isEmpty()){
           head =newNode;
           tail= newNode;
       }
       else{
           newNode.next =head;
           head =newNode;
       }
       size++;
   }
    public void insertABack(int a){
        Node newNode = new Node(a);
        if(isEmpty()){
            head = newNode;
            tail=newNode;
        }
        else{
            tail.next =newNode;
            tail = newNode;
        }
        size++;
        
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        
    }
    public static void main(String [] args){
        MyLinkedList a = new MyLinkedList();
        
        a.insertAFront(20);
        a.insertAFront(25);
        a.insertAFront(30);
        a.insertAFront(25);
        a.insertABack(30);
       a. print();
       
     
        
    }
    
}
