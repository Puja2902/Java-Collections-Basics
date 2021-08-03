package arrayListDemo;

import java.util.ArrayList;

public class PracDemo {

	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<String>();
		arrStr.add("hello");
		arrStr.add("world");
		arrStr.add("new");
		for (String s : arrStr) {
			System.out.println(s);
		}
		System.out.println(arrStr.contains("hello"));
		System.out.println(arrStr.indexOf("new"));
		System.out.println(arrStr.lastIndexOf("new"));
		System.out.println(arrStr.remove(1));
		System.out.println(arrStr);
	}

}
