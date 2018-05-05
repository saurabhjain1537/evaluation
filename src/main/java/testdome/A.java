package testdome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class A {

	int i=1;
	{
		i=2;
	}
	
	A() {
		i=3;
		
	}
	A(int i) {
		this.i=i;
	}
	{
		i=4;
	}
	public void print() {
		System.out.println(i);
	}
    public static void main(String[] args)  {
    	int i[] = {1};
    	A a = new A();
    	System.out.println(i[i.length-1]);
    	byte x = (byte)50L;
    	
    }
    void increment(int[] i) {
    	i[i.length-1]++;
    }
}


