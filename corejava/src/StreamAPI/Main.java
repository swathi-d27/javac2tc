package StreamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
public class Main {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
			
			List<Integer>prime=Arrays.asList(2,3,5,6,7);// getting source  from arrays
		
			
			IntSummaryStatistics stat = prime.stream() 
					.mapToInt((x) -> x) 
					.summaryStatistics();
			System.out.println("Highest prime number in the List : " + stat.getMax()); 
			System.out.println("Lowest prime number in the List : " + stat.getMin()); 
			System.out.println("Sum of all the prime numbers : " + stat.getSum());
			System.out.println("Average of all the prime numbers : " + stat.getAverage());

	}

	}


