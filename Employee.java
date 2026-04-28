// //normal copy
// public class Employee{
//     private String name;
//     private double salary;
//     public Employee(String n, double s){
//         this.name=n;
//         this.salary=s;
//     }
//     public void setName(String n){
//         this.name=n;
//     }
//     public void setSalary(double s){
//         this.salary=s;
//     }
//     public String getName(){
//         return name;
//     }
//     public double getSalary(){
//         return salary;
//     }
//     public static void main(String [] args){
//         Employee e1=new Employee("Jack",23000);
//         Employee e2=e1;
//         System.out.println(e1.getName());
//         e2.setName("John");
//         System.out.println(e1.getName());
//         System.out.println(e2.getName());
//     }
// }
// clone method from object class
import java.util.*;
public class Employee implements Cloneable{
    private String name;
    private double salary;
    public Employee(String n, double s){
        this.name=n;
        this.salary=s;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setSalary(double s){
        this.salary=s;
    }
    public String getName(){
        return name;
    }
    public static void main (String[] args) throws Exception{
        Employee e1=new Employee("Jack" ,21400);
        Employee e2=(Employee)e1.clone();
        System.out.println(e1.getName());
        e2.setName("John"); //e1 not affected
        System.out.println(e1.getName());
        System.out.println(e2.getName());
    }
    

}