package day18;
import java.util.Arrays;
import java.util.LinkedList;
public class Program1 {
	public static void main(String[] args) {
LinkedList<Integer> x=new LinkedList<>();
x.add(10);
x.add(20);
x.add(30);
System.out.println(x);
for(int y:x)
{
	System.out.println(y);	
}
for(int i=0;i<x.size();i++)
{
	System.out.println(x.get(i));	
}
Integer a[]= {12,13,14,15,16};
x.addAll(Arrays.asList(a));
System.out.println(x);
x.addAll(2,Arrays.asList(a));
System.out.println(x);
x.add(1,200);
System.out.println(x);
x.addAll(2,Arrays.asList(a));
System.out.println(x);
x.remove(3);
System.out.println(x);
x.removeAll(Arrays.asList(a));
System.out.println(x);
LinkedList<Integer>y=new LinkedList<Integer>();
y.addAll(x);
System.out.println(y);


	}

}
