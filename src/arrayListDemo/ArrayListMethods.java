package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("java");
		arr1.add("python");
		arr1.add("ruby");
		arr1.add("js");

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("testing");
		arr2.add("dev ops");

//		//to combine two array list
//		arr1.addAll(arr2);
//		System.out.println(arr1);
//		
//		arr1.addAll(2, arr2);
//		System.out.println(arr1);
//		
//		//clear = to make array list empty
//		arr1.clear();
//		System.out.println(arr1);

		@SuppressWarnings("unchecked")
		ArrayList<String> cloneList = (ArrayList<String>) arr1.clone();
		System.out.println(cloneList);

		System.out.println(arr2.contains("hee"));
		System.out.println(arr1.indexOf("ruby") > 0);

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("puja", "sharma", "puja"));
		int i = list1.lastIndexOf("y");
		System.out.println(i);

		list1.remove(1);
		System.out.println(list1);

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers);
		
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> sublist = new ArrayList<Integer>(num1.subList(1, 2));
		System.out.println(sublist);
		
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("ps","sp"));
		Object arr[] = name.toArray();
		
		for(Object o : arr) {
			System.out.println((String)o);
		}

	}

}
