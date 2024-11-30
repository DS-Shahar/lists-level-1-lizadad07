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
		// ----seif 7---
		System.out.println(delListByMicum(h,1));
		
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
}

