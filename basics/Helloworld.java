import java.util.*;
public class Helloworld {
    public static void main(String[] arg){
        System.out.println("Hello World");
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number");
        int input=in.nextInt();
        System.out.println("You entered: "+input);
        System.out.println("Enter a string");
        String str=in.next();
        System.out.println("You entered: "+str);
        System.out.println("Enter salary in float");
        float salary =in.nextFloat();
        System.out.println("You entered: "+salary);
    }
    
}


