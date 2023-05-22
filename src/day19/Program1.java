package day19;
import java.util.ArrayList;
import java.util.HashSet;



public class Program1 {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("aa");
		a.add("bb");
		a.add("cc");
		a.add("aa");
		a.add("bb");
		a.add("cc");
		System.out.println(a);
		HashSet<String>x=new HashSet<>();
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("aa");
		x.add("bb");
		x.add("cc");
		
		System.out.println(x);
		
		
		

	}

}
