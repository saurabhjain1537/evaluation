package testdome;
import java.util.ArrayList;
import java.util.List;

public class Entry {
    public void enter(String passportNumber) {
        //StringBuilder passprt = passportNumber;
        ArrayList<String> pport = new ArrayList<String>();
        pport.add(passportNumber);
        exit(pport);
    }

    public void exit(ArrayList<String> ppt) {
       
       if(ppt.size() > 0)
       {
           for(int i =0;i<=ppt.size();i++)
               
           {
       
           System.out.println(ppt.get(i));
               ppt.remove(i);
           }
    }}
    
    public static void main(String[] args) {
        Entry entry = new Entry();
        entry.enter("AB54321");
        entry.enter("UK32032");
       // System.out.println(entry.exit());
       // System.out.println(entry.exit());
    }
}