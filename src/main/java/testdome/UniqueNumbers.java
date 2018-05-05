package testdome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

import java.util.Objects;


public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) 
    {
         ArrayList<Integer> lst = new ArrayList<Integer>(numbers); 
        
        for(int i =0;i<=lst.size();i++)
        {
          if(!Objects.equals(lst.get(i), lst.get(i+1))) 
          {
              lst.add(i);
          }
             
          else {
              lst.remove(i);
          }
        }
        return lst;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }}
