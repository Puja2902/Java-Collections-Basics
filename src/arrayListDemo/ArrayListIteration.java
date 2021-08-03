package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<String> ();
		studentList.add("dugu");
		studentList.add("chetu");
		
		//default capacity 10 of arraylist
		//normal loop
		for(int i = 0 ; i <studentList.size() ; i++) {
			System.out.println(studentList.get(i));
		}
		System.out.println("------");
		//for each loop
		for(String s : studentList) {
			System.out.println(s);
		}
		System.out.println("--------");
		//iterator
		
		Iterator<String> it = studentList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------");
		//list with other collection
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(num);
		
	}
}
