package cse12pa4student;
import java.util.List;
import java.io.*;


public class Main {
	
	public static void main(String[] args) {
		
		List<Measurement> output = Measure.measure(args, 1,1000);
		String outString = Measure.measurementsToCSV(output);
		System.out.print(outString);
		
		try (PrintWriter out = new PrintWriter("output.csv")) {
		    out.println(outString);
		}
		catch(Exception E) {
			return;
		}
		
		/**
		 * f1
		 * this is linear probably O(n)
		 * 
		 * 
		 * f2
		 * 
		 * this is also linear, O(n)
		 * it increments by 3 so it should take a third less time than f1???
		 * 
		 * 
		 * 
		 * 
		 * f3
		 * this is probably log n because even though it iterates through n, n is updated to be n/10
		 * every cycle, so it iterates by n/10
		 * thus making it log n
		 * 
		 * 
		 * 
		 * f4
		 * 
		 * this is true n^2 because it has a for loop with a nested for loop, both
		 * who iterate through n. Thus it is n^2
		 * 
		 * 
		 * 
		 * 
		 * f5
		 * this is probably n^3 because the first for loop iterates through to n^2 which is pretty bad already
		 * then it iterates to n in a nested loop. Thus it takes n^3 which is very not good.
		 * 
		 * 
		 * 
		 * 
		 * f6
		 * this is an exponential function. Each for loop we take k and multiply by the value of i, which goes up to n.
		 * thus it is like 2^n. 
		 */
		
		
		/**
		 * 
		 * RUN C AND E SEPARATE
		 * 
		 * 
		 * 
		 * A seems to be linear. the trendline is linear, so it probably is
		 * this is from 1 to 10,000 n so
		 * 
		 * Definetly f2
		 * 
		 * B
		 * This one is also linear
		 * It grows larger faster than A so it has to be f1 since it is larger than f2
		 * 
		 * B is f1
		 * 
		 * 
		 * 
		 * 
		 * C seems to be a polynomial
		 * Fits the best with polynomial trend line of degree 3
		 * Defnietly f5 
		 * 
		 * 
		 * D seems to be a polynoimial.... so maybe n^2? probably one of the f5 or f4
		 * Fits best with polynomial trend line of degree 2
		 * Definetly f4
		 * 
		 * 
		 * 
		 * E
		 * Grows the fastest out of all of them. Probably the biggest one
		 * Most likely f6
		 * is f6
		 * 
		 * 
		 * 
		 * F 
		 * 
		 * is likely log 10 because of how small it is. so f3
		 * It is really small. It is f3
		 * 
		 * 
		 */
		
		
		
	}
}
