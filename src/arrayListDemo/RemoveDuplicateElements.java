package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,1,5,2,7,8,8));
		//1.LinkedHashSet
		LinkedHashSet<Integer> linkHashSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> ListWithoutDuplicates = new ArrayList<Integer>(linkHashSet);
		System.out.println(ListWithoutDuplicates);
		
		
		//2.JDK 8 - Stream
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,5,2,7,8,8));
		List<Integer> uniqueList = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
	}

}
