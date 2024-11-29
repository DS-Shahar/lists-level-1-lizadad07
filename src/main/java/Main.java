public class Main {
	public static void main(String []args) {
		
		Node <String> n1 = new Node<String> ("Hellooo");
		Node <String> n2 = new Node<String> ("Hii");
		Node <String> n3 = new Node<String> ("Holaa");
		
		Node <Integer> n4 = new Node<Integer> (4);
		Node <Integer> n5 = new Node<Integer> (5);
		Node <Integer> n6 = new Node<Integer> (6);
		
		n4.setNext(n5);
		n5.setNext(n6);
		
//		n1.setNext(n2);
//		n2.setNext(n3);
		//System.out.println(n1);
//		 int[] arr = new int[]{1, 2, 3};
//		 System.out.println(arrToList(arr));

		Node <Integer> h = n4;
		h= delList(h,5);
		System.out.println(h);
		
		
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


}
