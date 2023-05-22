package day21;
import java.util.LinkedList;
import java.util.Queue;


public class Program1 {

	public static void main(String[] args) {
		LinkedList<String>x=new LinkedList<String>();
		x.add("aaa");
		x.add("bbb");
		x.add("ccc");
		x.add("ddd");
		x.add("eee");
		x.add("fff");
		System.out.println(x.peek());
		System.out.println(x.peekFirst());
		System.out.println(x.peekLast());
		
		System.out.println(x.poll());
		System.out.println(x);
		
		System.out.println(x.pollFirst());
		System.out.println(x);
		
		System.out.println(x.pollLast());
		System.out.println(x.pop());
		System.out.println(x);
		
		x.offer("aaa");
		System.out.println(x);
		
		x.offerFirst("bbb");
		System.out.println(x);
		
		x.offerLast("ccc");
		System.out.println(x);
		
		System.out.println(x.get(2));
		System.out.println(x.getFirst());
		System.out.println(x.getLast());
		
x.remove();
System.out.println(x);

x.removeFirst();
System.out.println(x);

x.removeLast();
System.out.println(x);
x.add("aaa");
x.add("bbb");
x.add("ccc");
x.add("ddd");
x.add("eee");
x.add("fff");

System.out.println(x);

x.removeLastOccurrence("ccc");
System.out.println(x);

x.removeFirstOccurrence("ddd");
System.out.println(x);

System.out.println(x.indexOf("aaa"));
System.out.println(x.indexOf("aaabbb"));


System.out.println(x.lastIndexOf("eee"));
System.out.println(x.indexOf("eee"));



		
		
		
		
			
		
		

	}

}
