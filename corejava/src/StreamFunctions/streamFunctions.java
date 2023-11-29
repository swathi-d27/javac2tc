package StreamFunctions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class streamFunctions {
	void StreamFunctions() {
		// Count the empty strings
				List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); // source
				long count = strList.stream() // creation of stream
						.filter(x -> x.isEmpty())
						.count();
				System.out.printf("List %s has %d empty strings %n", strList, count);  

				// Count String with length more than 3
					long num = strList.stream() // creation of stream
						.filter(x -> x.length()> 3) // intermediate operation op defg
						.count(); // Terminal Operation
				System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);

				// Remove all empty Strings from List
				List<String> filtered = strList.stream() 
						.filter(x -> !x.isEmpty()) 
						.collect(Collectors.toList());
				System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);

				// Create a List with String more than 2 characters
				filtered = strList.stream() 
						.filter(x -> x.length()> 2) 
						.collect(Collectors.toList()); 
				System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
				
				// Create List of square of all distinct numbers
				List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); // Source
				List<Integer> distinct = numbers.stream() // created a stream
						.map( i -> i*i).distinct() 
						.collect(Collectors.toList()); 
				System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);

				//Get count, min, max, sum, and average for numbers
				List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
				IntSummaryStatistics stats = primes.stream() 
						.mapToInt((x) -> x) 
						.summaryStatistics();
				System.out.println("Highest prime number in List : " + stats.getMax()); 
				System.out.println("Lowest prime number in List : " + stats.getMin()); 
				System.out.println("Sum of all prime numbers : " + stats.getSum());
					System.out.println("Average of all prime numbers : " + stats.getAverage());
}}