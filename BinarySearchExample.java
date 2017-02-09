import java.io.*;
import java.util.*;

public class BinarySearchExample {
	public static void main(String args[]) {
		int n,search,first,middle,last,array[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		n = s.nextInt();
		array = new int[n];
		
		System.out.println("Enter "+n+" integers");
		
		for(int i=0;i<n;i++) {
			array[i] = s.nextInt();
		}		
		
		System.out.println("Enter the value to search");
		search = s.nextInt();

		first = 0;
		last = n-1;
		middle = (first+last)/2;

		while(first<=last) {
			if(array[middle]<search)
				first = middle+1;
			else if(array[middle]==search) {
				System.out.println(search+ " found at "+(middle+1)+ ".");
				break;
			} 
			else 
				last = middle-1;
			
			middle = (first+last)/2;
		}
		if(first>last)
			System.out.println(search+ " is not present in the list." );
	}
}