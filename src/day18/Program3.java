package day18;
import java.util.Arrays;
import java.util.LinkedList;

public class Program3 {

	public static void main(String[] args) {
		LinkedList<Integer>x=new LinkedList<>();
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println(x);
		System.out.println(x.contains(10));
		System.out.println(x.containsAll(Arrays.asList(10,20,30,40,60)));
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println(x);
		x.add(1,400);
		System.out.println(x);
		x.add(1,200);
		System.out.println(x);
	

	}

}
