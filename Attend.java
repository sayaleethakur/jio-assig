import java.util.Arrays;
import java.util.Set ;
import java.util.HashSet;
import java.util.*; 
public class Attend {
    public static boolean checkRecord(String s) {
    int a=0, l=0;
    for(int i=0;i<s.length();i++) {
        if(s.charAt(i)=='A') 
        a++;
        if(s.charAt(i)=='L') 
        l++;
        else l=0;
        if(a>=2||l>2) return false;
    }
    return true; 
    }
  public static void main(String[] args) {
        String attendence ="PPALLP"; 
        boolean ans=checkRecord(attendence); 
        System.out.println(ans);
  }
}