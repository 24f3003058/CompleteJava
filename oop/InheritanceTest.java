import java.util.Scanner;

class Faculty{
    
   private String name;
   private double salary;
  
   public Faculty(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }
   
   public double bonus(float percent){
       return (percent/100.0)*salary;
   }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
  
    // Define method getDetails()
    public String getDetails(){
        return getName()+", "+getSalary();
    }
    
    // Overload method getDetails(float percent)
    
    public String getDetails(float percent){
        return getName()+", "+getSalary()+", bonus = "+bonus(percent);
    }
}

class Hod extends Faculty{
    private String personalAssistant;
  
    // Constructor for Hod
    Hod(String n,double s,String pa){
        super(n,s);
        this.personalAssistant=pa;   
    }
    public String getPersonalAssistant(){
        return personalAssistant;
    }
    
    // Override method bonus(float percent)
    public double bonus(float percent){
        return (percent/100.0)*getSalary();
    }
    
    
    // Override method getDetails()
    public String getDetails(){
        return getName()+", "+getSalary()+", "+getPersonalAssistant();
    }
    
    
    // Override method getDetails(float percent)
    public String getDetails(float percent){
        return getName()+", "+getSalary()+", "+getPersonalAssistant()+", "+bonus(percent)/2;
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        System.out.println(obj1.getDetails(10));
        System.out.println(obj2.getDetails());
        System.out.println(obj2.getDetails(10));
    }
}