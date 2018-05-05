import java.io.*;
class Test {
    public static void main(String[] args) {
	int num = 3;
	int multiplier = 1;
	int count =0;
	while(multiplier < 16) {
		if((num & multiplier) > 0) {
			count++;
		}
		multiplier = multiplier *2;
	}
	System.out.println(count);
	
    }
}