import java.util.*;
public class Main{
    private class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Main(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public Main(Node head, Node tail,int size){
        this.head=head;
        this.tail=tail;
        this.size=size;
    }

    //O(1)
    public int size(){
        return this.size;
    }

    //O(1)
    public boolean isEmpty(){
        return this.size==0;
    }
    
    //O(1)
    public int getFirst() throws Exception{
       if(this.isEmpty()){
          throw new Exception("List is Empty");
       }
       return this.head.data;
    }

    //O(1)
    public int getLast() throws Exception{
        if(this.isEmpty()){
            throw new Exception("List is Empty");
        }
        return this.tail.data;
    }

    //O(N)
    public int getAt(int idx) throws Exception{
        Node temp=this.getNodeAt(idx);
        return temp.data;
    }

    private Node getNodeAt(int idx) throws Exception{
        if(this.isEmpty()){
            throw new Exception ("List is Empty");
        }
        if(idx<0 || idx>=this.size()){
            throw new Exception("Invalid Arguements");
        }
        Node reVal=this.head;
        for(int i=0;i<idx;i++){
            reVal=reVal.next;
        }
        return reVal;
    }


    //O(1)
    public void addFirst(int data){
        
    }

    
}