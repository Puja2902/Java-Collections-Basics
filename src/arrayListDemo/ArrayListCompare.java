package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		//1.sort and equal
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D" ));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D" ));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D" ));
		
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));
		
		Collections.sort(l3);
		System.out.println(l3);
		System.out.println(l1.equals(l3));
		
		l1.retainAll(l3);
		System.out.println(l1);
		

	}

}
