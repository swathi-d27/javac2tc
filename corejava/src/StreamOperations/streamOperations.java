package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class streamOperations {
	void allOperations() {
		
		Stream<Integer>stream=Stream.of(10,30,40,50,69);
		System.out.println("no of elements"+stream.count());
		Integer[] values=new Integer[] {22,33,44,66,77};
	
		stream=Arrays.stream(values);
		// map
				System.out.println("Squares of " + Arrays.toString(values) + " is as follows :");
				stream.map(num -> num * num).forEach(System.out::println);

				// limit 
				System.out.println("First 2 elements are : ");
				Arrays.stream(values).limit(2).forEach(System.out::println);

				// skip 
				System.out.println("Elements excepts first 4 : ");
				Arrays.stream(values).skip(4).forEach(System.out::println);

				// distinct 
				System.out.println("Distinct Elements are : ");
				Arrays.stream(values).distinct().forEach(System.out::println);

				List<String> words = Arrays.asList("Hello", "Stream", "Learning");
				//words.add("In Java"); Immutable list
				
				// creating a stream from a List
				Stream<String> stream1 = words.stream();

				// map
				System.out.println("Strings in uppercase : ");
				List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
				System.out.println(s1);
				
				// Count the empty strings
				
				List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); // source
				
				long count = strList.stream() // creation of stream
						
						.filter(x -> x.isEmpty())
						.count();
				System.out.printf("List %s has %d empty strings %n", strList, count);  

				
	}
}