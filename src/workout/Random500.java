package workout;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Generate 500 RANDOM numbers, and find the Nth smallest number (range from 100 – 1000)

public class Random500 {

	public static void main(String[] args) {
		Set<Integer> mynum=new TreeSet<Integer>();
			
		while(mynum.size()<500) {
			mynum.add(getNumber());
			
		}
		System.out.println("My Random 500 Number:");
		System.out.println(mynum);
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter your Nth smallest  number");
		int n=sc.nextInt();
		Object[] x=mynum.toArray();
		System.out.println("Printing "+n+"th smallest number");
		System.out.println(x[n-1]);
		
		sc.close();
	}

	public static int getNumber() {
		Random random=new Random();
		int n=random.nextInt(900)+100;
		return n;
		
	}
}
