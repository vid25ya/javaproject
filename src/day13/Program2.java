package day13;

public class Program2 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int i=1;
		while(i<=10)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			i=i+1;
		}
			

	}

}
