//never ever tempr the head-->Because then we forget the starting point
// to traverse through a linked list , we need to start at the head of the linked list
// and move to the next node and repeat this process till we reach the end, 
//which is denoted by NULL in the linkedlist.

package LinkedList;
class Node{
    int data;
    Node next;
    //constructor with both data and the next node
    Node(int data1, Node next1){
        data=data1;
        next=next1;
    }
    //Constructor will only data (assumes next is null)
    Node(int data1){
        data=data1;
        next=null;
    }
}

public class TraversalInll{
  public static void main(String args[]){
    //initialising the array

    int arr[]={2,5,7,8};

    //check if the array is empty
    if(arr.length == 0){
        System.out.println("Array is empty, cannot create a linked list");
        return;
    }

    //creating the head node with the first element
    Node head = new Node(arr[0]);
    Node current=head;
    
    //iterating through the remaining elements to create and link nodes
    for(int i=1;i<arr.length;i++){
        current.next=new Node(arr[i]);
        current=current.next;
    }

    //Traversing through the linked list and printing data
    Node temp= head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
}