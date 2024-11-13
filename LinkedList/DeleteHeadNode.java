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
}
public class DeleteHeadNode{
    public static Node removesHead(Node head){
        //check if the linked list is empty
        if(head == null ) return null;
        head=head.next;
        return head;
    }
    //method to print the linked list
    public static void printll(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    //main method 
    public static Node createLinkedList(int arr[]){
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node current=head;
        for(int i=1;i<arr.length;i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Node head= createLinkedList(arr);
        head=removesHead(head);
        printll(head);
    }
}