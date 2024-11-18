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
        Node node= new Node(data,this.head);

        if(this.size==0){
            this.head=node;
            this.tail=node;
        }
        else{
            this.head=node;
        }
        this.size++;
    }


    //O(1)
    public void addLast(int data){
        Node node= new Node(data,null);

        if(this.size==0){
            this.head=node;
            this.tail=node;
        }
        else{
            this.tail.next=node;
            this.tail=node;
        }
        this.size++;
    }

    public void addAt(int idx, int data) throws Exception{
        if(idx<0 || idx>this.size()){
            throw new Exception("Invalid Argurements");
        }
        if(idx==0){
            this.addFirst(data);
        }
        else if(idx==this.size){
            this.addLast(data);
        }
        else{
            Node nm1= this.getNodeAt(idx-1);
            Node n=nm1.next;

            Node node = new Node(data,n);
            nm1.next=node;

            this.size++;
        }
    }

    public int removeFirst() throws Exception{
        if(this.isEmpty()){
            throw new Exception("List is Empty");
        }

        int reVal= this.head.data;
        if(this.size()==1){
            this.head=null;
            this.tail=null;
        }
        else{
            this.head=this.head.next;
        }
        this.size--;
        return reVal;
    }

    public int removeLast() throws Exception{
        if(this.isEmpty()){
            throw new Exception("List is Empty");
        }

        int reVal=this.tail.data;

        Node nm2=this.getNodeAt(this.size()-2);
        nm2.next=null;
        this.tail=nm2;
    }
    this.size--;
    return reVal;
}