package cse12pa4student;

import java.util.List;
import java.util.ArrayList;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {

	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		List<Measurement> l = new ArrayList<Measurement>();
		for (String s : toRun) {
			long start = System.nanoTime();
			long end = System.nanoTime();
			
			for(int i = startN; i <= stopN; i++){
				if (s.equals("A")) {
					start = System.nanoTime();
					mysteryA(i);
					end = System.nanoTime();
					l.add(new Measurement("A", i, end - start));
				}
				if (s.equals("B")) {
					start = System.nanoTime();
					mysteryB(i);
					end = System.nanoTime();
					l.add(new Measurement("B", i, end - start));
				}
				if (s.equals("C")) {
					start = System.nanoTime();
					mysteryC(i);
					end = System.nanoTime();
					l.add(new Measurement("C", i, end - start));
				}
				if (s.equals("D")) {
					start = System.nanoTime();
					mysteryD(i);
					end = System.nanoTime();
					l.add(new Measurement("D", i, end - start));
				}
				if (s.equals("E")) {
					start = System.nanoTime();
					mysteryE(i);
					end = System.nanoTime();
					l.add(new Measurement("E", i, end - start));
				}
				if (s.equals("F")) {
					start = System.nanoTime();
					mysteryF(i);
					end = System.nanoTime();
					l.add(new Measurement("F", i, end - start));
				}

			}

		}

		return l;
	}

	public static String measurementsToCSV(List<Measurement> toConvert) {
		String output = "name,n,nanoseconds\n";
	//	List<Measurement> tempList = new ArrayList<Measurement>();
	//	String[] letters = {"A", "B" ,"C", "D", "E", "F"};
			for (Measurement m : toConvert) {
				output += m.name + "," + m.valueOfN + "," + m.nanosecondsToRun + "\n";
				}
		
		return output;
	}

	/* Add any helper methods you find useful */
	
}
