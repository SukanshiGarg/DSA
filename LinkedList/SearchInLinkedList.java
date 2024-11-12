package LinkedList;
// Node class represents a node in a linked list
class Node {
    int data;      // Data stored in the node
    Node next;     // Reference to the next node in the list

    // Constructor with both data and next node as parameters
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

// LinkedList class contains utility methods for linked list operations
public class LinkedList {

    // Function to check if a given element is present in the linked list
    public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Check if the current node's data is equal to the desired element
            if (temp.data == desiredElement)
                return 1;  // Return 1 if the element is found

            // Move to the next node
            temp = temp.next;
        }

        return 0;  // Return 0 if the element is not found in the linked list
    }

    // Function to create a linked list from an array
    private static Node createLinkedListFromArray(int[] arr) {
        if (arr.length == 0) return null; // Return null if the array is empty

        Node head = new Node(arr[0]); // Create head node with first element
        Node current = head;

        // Iterate over the rest of the elements to create nodes
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]); // Link new node to the current node
            current = current.next;          // Move current to the new node
        }

        return head; // Return the head of the linked list
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};  // Array to be converted into a linked list
        Node head = createLinkedListFromArray(arr); // Create linked list from array

        int val = 3;  // Element to be checked for presence in the linked list

        // Call the checkifPresent function and print the result
        System.out.print(checkifPresent(head, val));
    }
}
