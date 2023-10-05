import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll =new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.addFirst(5);
		ll.add(2,60);
		ll.add(25);
		ll.addLast(35);
		System.out.println("Number List is" + ll);
		
		System.out.println("First Element is" + ll.getFirst());
		System.out.println("Last Element  is" + ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Number removing after First and Last");
		
		ListIterator<Integer> ll-ll.ListIterator();
		
		while(ll.hasNext())
			System.out.println(li);

	}

}
