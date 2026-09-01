import java.util.*;

public class EvenStringDisplay {
    public static void evenDisplay(String s){
        String new_str="";
        for (int i=0;i<s.length();i=i+2){
           System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        evenDisplay(s1);
    }
}
