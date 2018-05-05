package testdome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringTest {
	
	private List<Character> vowelList = new ArrayList<>();
	
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();
        
        System.out.println(inputString + ". Length = " + inputString.length());
    }
}
