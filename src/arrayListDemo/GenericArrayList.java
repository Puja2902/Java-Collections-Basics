package arrayListDemo;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(1);
		intArr.add(2);
		System.out.println(intArr.size());

		ArrayList<Double> doubArr = new ArrayList<Double>();
		doubArr.add(11.0);
		doubArr.add(1.0);

		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("puja");

	}

}
