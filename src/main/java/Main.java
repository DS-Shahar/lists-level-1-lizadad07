import java.util.*;
public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String []args) {

		
//		Node <String> n1 = new Node<String> ("Hellooo");
//		Node <String> n2 = new Node<String> ("Hii");
//		Node <String> n3 = new Node<String> ("Holaa");
//		
//		n1.setNext(n2);
//		n2.setNext(n3);
//		System.out.println(n1);
		
         //---- seif 1+2----
//		 int[] arr = new int[]{1, 2, 3};
//		 System.out.println(arrToList(arr));
		
//		Node <Integer> n4 = new Node<Integer> (4);
//		Node <Integer> n5 = new Node<Integer> (5);
//		Node <Integer> n6 = new Node<Integer> (6);
//		
//		n4.setNext(n5);
//		n5.setNext(n6);
//		
//

		
//		System.out.println(BuildList()); // seif 3
//		printList(BuildList());           // seif 3
		
		// -----seif 4-----
		Node <Integer> n10 = new Node<Integer> (31);
		Node <Integer> n11 = new Node<Integer> (48);
		Node <Integer> n12 = new Node<Integer> (54);

		
		n10.setNext(n11);
		n11.setNext(n12);

//		
//		onlyEvenNumbers(n10);
		// ----- seif 5-----
//		System.out.println(ifNumIsInList(n10,31));
		
		// ----- seif 6-----
		Node <Integer> h = n10;
//		h= delList(h,31);
//		System.out.println(h);
		//------seif 7--------
//		System.out.println(delListByMicum(h,1)); 
		
		//------seif 8--------
		Node <Integer> n13 = new Node<Integer> (55);
		Node <Integer> n14 = new Node<Integer> (54);
		Node <Integer> n15 = new Node<Integer> (48);
		Node <Integer> n16 = new Node<Integer> (31);
		
		n13.setNext(n14);
		n14.setNext(n15);
		n15.setNext(n16);
		
		Node <Integer> h2 = n13;
		System.out.println(recL1InL2(h,h2));
		//------seif 9--------
		//L1InL2(h,h2);
		//------seif 10--------
		//System.out.println(L1InL2List(h,h2));
		//------seif 11--------
		System.out.println(L1DelL2(h,h2));
		
	}

	public static Node<Integer> arrToList(int a[]) {
		Node<Integer> first = new Node<Integer> (a[0]);
		Node<Integer> prev;
		prev = first;
		Node<Integer> p;
		
		for (int i=1; i<a.length; i++) {
			p = new Node<Integer> (a[i]);
			prev.setNext(p);
			prev = p;
			
		}
		return first;
	}
	public static Node<Integer> BuildList() {
		Node<Integer> head = null; // Head of the list
        Node<Integer> tail = null; // Tail for appending
        
        System.out.println("Pls enter a positive num");
        int num = input.nextInt();
        Node<Integer> newNode = new Node<>(num);
        head = newNode; // First node
        tail = newNode;
        
        while (num!=-1) {
                tail.setNext(newNode); // Link to the next node
                tail = newNode;      // Update the tail

        	System.out.println("Pls enter a positive num");
            num = input.nextInt();
            newNode = new Node<>(num);
        }
        return head;

		
	}
	
	// Method to print the list
    public static void printList(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
        	if (current.getNext()!=null) {
            System.out.print(current.getValue() + " ==> ");
            current = current.getNext();
        	}
        	else {
        		System.out.print(current.getValue());
                current = current.getNext();
        	}
        }
        System.out.println();
    }
    
    public static void onlyEvenNumbers(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
        	
        	if (current.getValue()%2==0) {
        		System.out.print(current.getValue() + " ");
        	}
            current = current.getNext();
        	
        }
        System.out.println();
    }
    
    public static boolean ifNumIsInList(Node<Integer> head, int x) {
        Node<Integer> current = head;

        while (current != null) {
        	
        	if (current.getValue()==x)
        		return true;
            current = current.getNext();
        	
        }
        return false;
    }
	
	
	public static Node<Integer> delList(Node<Integer> h, int x) {
		Node<Integer> p = new Node<Integer>(-1,h);
		h=p;
		Node<Integer> t;

		
		while (p.hasNext()) {
			if (p.getNext().getValue()==x){
				t=p.getNext();
				p.setNext(p.getNext().getNext());
				t.setNext(null);
				return h.getNext();
			}
			p=p.getNext();
			}
		return h.getNext();			
		}
	
	public static Node<Integer> delListByMicum(Node<Integer> h, int x) {
		Node<Integer> p = new Node<Integer>(-1,h);
		int i = 1;
		h=p;
		Node<Integer> t;
		

		
		while (p.hasNext()) {
			if (i==x){
				t=p.getNext();
				p.setNext(p.getNext().getNext());
				t.setNext(null);
				return h.getNext();
			}
			p=p.getNext();
			i++;
			}
		return h.getNext();			
		}
	
	


	// Helper function
	private static boolean recL1InL2(Node<Integer> L1, Node<Integer> L2) {
	    if (L1 == null) {
	        return true;
	    }

	    if (!contains(L1.getValue(), L2)) {
	        // Current L1 value not found in L2
	        return false;
	    }

	    // Tail recursive call to check the rest of L1
	    return recL1InL2(L1.getNext(), L2);
	}

	// Function to check if a value exists in the list L2
	private static boolean contains(int value, Node<Integer> L2) {
	    while (L2 != null) {
	        if (L2.getValue() == value) {
	            return true;
	        }
	        L2 = L2.getNext();
	    }
	    return false;
	}
	
	
	public static void L1InL2(Node<Integer> L1, Node<Integer> L2) {
		Node<Integer> p1 = new Node<Integer>(-1,L1);
		
	
		while (p1.hasNext()) {
			Node<Integer> p2 = new Node<Integer>(-1,L2);
			while (p2.hasNext()) {
				if (p1.getNext().getValue()==p2.getNext().getValue()) {
					System.out.println(p1.getNext().getValue());
					
				}
				p2=p2.getNext();
			}

			p1=p1.getNext();

		}
	}
	
	public static Node<Integer> L1InL2List(Node<Integer> L1, Node<Integer> L2) {
	    // Create a dummy node to start the new list
	    Node<Integer> dummy = new Node<>(null); 
	    Node<Integer> current = dummy; // Pointer to the last node in the new list

	    // Iterate over L1
	    while (L1 != null) {
	        // Check if the value of L1 exists in L2
	        Node<Integer> p2 = L2;
	        boolean found = false;

	        while (p2 != null && !found) {
	            if (L1.getValue().equals(p2.getValue())) {
	                found = true; // Value exists in L2
	            }
	            p2 = p2.getNext();
	        }

	        // If found, add it to the new list
	        if (found) {
	            current.setNext(new Node<>(L1.getValue())); // Append the value to the result list
	            current = current.getNext();
	        }

	        L1 = L1.getNext(); // Move to the next node in L1
	    }

	    // Return the new list starting from the first real node
	    return dummy.getNext();
	}
	
	public static Node<Integer> L1DelL2(Node<Integer> L1, Node<Integer> L2) {
	    // Create a dummy node to simplify removal of the head node if necessary
	    Node<Integer> dummy = new Node<>(null, L1); 
	    Node<Integer> prev = dummy; // Pointer to the previous node
	    Node<Integer> current = L1; // Pointer to the current node

	    // Iterate through L1
	    while (current != null) {
	        // Check if the current node value exists in L2
	        Node<Integer> p2 = L2;
	        boolean found = false;

	        while (p2 != null && !found) {
	            found = current.getValue().equals(p2.getValue());
	            p2 = p2.getNext();
	        }

	        if (found) {
	            // Remove the current node
	            prev.setNext(current.getNext());
	            current.setNext(null); // Detach the current node
	        } else {
	            // Move the prev pointer forward if no deletion occurred
	            prev = current;
	        }

	        // Move the current pointer forward
	        current = prev.getNext();
	    }

	    return dummy.getNext();
	}


}
	

