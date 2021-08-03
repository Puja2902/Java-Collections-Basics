package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// no order - no indexing
		// stores value --Key,Value <k,v>
		// key cannot be duplicate
		// can store n number of null values but only one null key
		// it is not thread safe or not synchronized

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("UK", "London");
		capitalMap.put("Australia", "Sydney");
		capitalMap.put("Australia", "Sydney1");
		capitalMap.put(null, "Hello");
		capitalMap.put(null, "check");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);

		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get("Jharkhand"));
		System.out.println(capitalMap.get("Australia"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("France"));
		
		//iterator over the keyset()
		Iterator<String> it = capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " + key + " ; value = " + value);
			
		}
		System.out.println("---------");
		//iterator over the set (pair) : by using entrySet
		Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()){
		Entry<String,String> e = it1.next();
		System.out.println("Key= " + e.getKey() + " and Value = " + e.getValue());
		}
		System.out.println("********");
		//using for each of  java 8 and lambda 
		capitalMap.forEach((k,v) -> System.out.println("key = " + k + " ; value = " + v));
		
		
		
	}

}
