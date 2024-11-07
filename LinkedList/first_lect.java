package LinkedList;

public class first_lect {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void AddFirst(int item){
      Node nn = new Node();
      nn.data=item;
      if(size == 0){
        head=nn;
        tail= nn;
        size++;
      }
      else{
        nn.next=head;
        head=nn;
        size++;
      }
    }

    public void Display(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static int length(Node head){
      int count=0;
      while(head!=null){
        count++;
        head=head.next;
      }
      return count;
    }
    public static void main(String args[]){
        first_lect l1 = new first_lect();
        l1.AddFirst(10);
        l1.AddFirst(20);
        l1.AddFirst(30);
        l1.AddFirst(40);
        l1.AddFirst(50);
        l1.AddFirst(60);
        l1.Display();

    }
    
}
