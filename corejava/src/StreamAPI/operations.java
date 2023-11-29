package StreamAPI;

import java.util.Arrays;
import java.util.List;




import java.util.stream.Stream;
public class operations {
	public void operationss() {
		// create a stream from set of values
		Stream<Integer >stream=Stream.of(10,20,30,40,50,60,70);
		stream.forEach(System.out::println);
		
		Integer[] values=new Integer[] {3,4,6,7,8};
		// creating a stream from array
		stream=Arrays.stream(values);
		
		//map function
		System.out.println("squares of"+Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println);
		
		//limit returns first n element
		System.out.println("First 2 elements");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//Skip skipping first n elements
		System.out.println("Skipping first 3 elements");
		Arrays.stream(values).skip(3).forEach(System.out::println);
		
		List<String>words=Arrays.asList("hello","stream");
		words.add("hi");// immutable list
		words.forEach(System.out::println);
		
		
		
	
		
	}
}
