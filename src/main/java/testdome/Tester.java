package testdome;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester {
	
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
	
    static int[] rearrange(int[] elements) {
        int numElements = elements.length;
        ArrayList<Integer> resultList = new ArrayList<>();
        
        //Treemap to store map of 'count of 1s in the binary representation' to Array of such elements
        TreeMap<Integer, ArrayList<Integer>> binOneToElementMap = new TreeMap<>();
        for(int index = 0; index < numElements; index++) {
        	
        	int element = elements[index];
        	Integer numBinOne = determineBinaryOnes(element);
        	ArrayList<Integer> elementList = binOneToElementMap.get(numBinOne);
        	if(elementList == null) {
        		elementList = new ArrayList<>();
        		binOneToElementMap.put(numBinOne, elementList);
        	}
        	elementList.add(new Integer(element));
        }
        
        Set<Integer> keys = binOneToElementMap.keySet();
        for(Integer key: keys) {
        	ArrayList<Integer> elementList = binOneToElementMap.get(key);
            Collections.sort(elementList);
            resultList.addAll(elementList);
        }
                
        int[] resultArray = new int[numElements];
        for (int i =0 ; i< resultList.size(); i++ ) {
        	resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    static int determineBinaryOnes (int element) {
		int n = 1;
		int count = 0;
		while(n > 0) {
			if((element & n) > 0 ) {
				count++;
			}
			n = n << 1;
			
		}
		return count;
	}
    
    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }
        
        // call rearrange function
        int[] results = rearrange(elements);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}