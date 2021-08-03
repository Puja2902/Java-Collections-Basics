package hashMapConcepts;

import java.util.HashMap;

public class HashMapPractice1 {

	public static void main(String[] args) {
		HashMap<String, Integer> courseMap = new HashMap<String, Integer>();
		courseMap.put("Java", 1);
		courseMap.put("Python", 2);
		courseMap.put("JS", 3);

		System.out.println(courseMap);

	}

}
