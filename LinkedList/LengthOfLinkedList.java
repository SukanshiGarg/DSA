package LinkedList;
class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};

public class LengthOfLinkedList{
   //fnc. to calculate the length of a linked list

   public static lengthofAll(Node head){
     int cnt=0;
     Node temp=head;

     //Traverse the linked list and count nodes
     while(temp!=null){
        temp=temp.next;
        cnt++; //increment cnt for every node traversal
     }
     return cnt;
   }
   public static Node convertarrToLinkedList(int arr[]){
    if(arr.length ==0 ) return null;
    
    Node head =new Node(arr[0]);
    Node current=head;
                                                                     
    //Create and Link nodes for the remaining elements
    for(int i=1;i<arr.length;i++){
        current.next=new Node(arr[i]);
        current=current.next;
    }
    return head;
   }
   public static void main(String args[]){
    int arr[]={2,5,8,7};
    Node head=convertarrToLinkedList(arr);
    System.out.println(lengthofAll(head));
   }
}