/*
 Edge cases: if the linked list is empty , we return null
 if there is only one node in the list , that node itself will be the tail, therefore 
 we return null after delting that node
 */



package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class DeleteTailNode {
    public static Node deleteTail(Node head){
        if(head== null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            //keep on updating the value of the temp
            temp=temp.next;
        }
        //nullify the connection from the second to last node to delete the last node
        temp.next=null;
        return head;
        }

        //function to print the linked list 
        public static void printll(Node head){
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
        }

        //main method
        public static void main(String[] args) {
            // Initialize an array with integer values
            int[] arr = {2, 5, 8, 7};
            // Create the linked list with nodes initialized with array values
            Node head = new Node(arr[0]);
            head.next = new Node(arr[1]);
            head.next.next = new Node(arr[2]);
            head.next.next.next = new Node(arr[3]);
            // Delete the tail of the linked list
            head = deleteTail(head);
            // Print the modified linked list
            printll(head);
        }
            

}

