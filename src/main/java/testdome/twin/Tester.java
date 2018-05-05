package testdome.twin;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester {
	
    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method. 
     */
    static boolean[] twins(String[] a, String[] b) {
    	int numAElements = a.length;
    	int numBElements = b.length;
    	
    	if(numAElements != numBElements) {
    		//TODO --throw exception
    	}
        boolean[] result = new boolean[numAElements];
        
        for(int index = 0; index < numAElements; index++) {
        	String inputA = a[index];
        	String inputB = b[index];
        	
        	result[index] = twins(inputA, inputB);        	
        	
        }
        
        return result;
    }
    
    /**
     * Determine whether two strings are twins
     * @param a
     * @param b
     * @return
     */
    static boolean twins(String a, String b) {
    	boolean result = false;
    	
    	if(a.length() == b.length()) {
    		List<Character> aEven = oddEvenCharList(a, true);
    		List<Character> bEven = oddEvenCharList(b, true);
    		List<Character> aOdd = oddEvenCharList(a, false);
    		List<Character> bOdd = oddEvenCharList(b, false);
    		
    		Collections.sort(aEven);
    		Collections.sort(bEven);
    		Collections.sort(aOdd);
    		Collections.sort(bOdd);
    		
    		result = (aEven.equals(bEven) && aOdd.equals(bOdd));
    		
    	}
    	
    	return result;
    }
    
    /**
     * This method returns a List of chars at Odd of Even indexes based on @param isEven 
     * @param input
     * @param isEven
     * @return
     */
    static List<Character> oddEvenCharList(String input, boolean isEven) {
    	List<Character> charList = new ArrayList<>();
    	int remainder = 1;
    	if(isEven) {
    		remainder = 0;
    	}
    	for(int index = 0; index < input.length(); index++) {
    		if(index%2 == remainder) {
    			charList.add(input.charAt(index));
    		}
    	}
    	
    	return charList;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
        
        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }
        
        // call twins function
        boolean[] results = twins(a, b);
        
        for(int i = 0; i < results.length; i++) {
            System.out.println(results[i]? "Yes" : "No");
        }
    }
}