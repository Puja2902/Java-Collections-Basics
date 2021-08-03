package arrayListDemo;

import java.util.ArrayList;

public class ProblemOne {

	public static void main(String[] args) {
		// Create ArrayList , add element to it and print it

		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("puja");
		arr.add(11);

//		for (Object o : arr) {
//			System.out.println(o);
//		}
		
//		arr.add(1, "papa");
//		System.out.println(arr);
		
		for(int i = arr.size() - 1 ; i >=0 ; i--) {
			System.out.println(arr.get(i));
		}

	}
	
	

}
