//normal copy
public class Employee{
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
    public double getSalary(){
        return salary;
    }
    public static void main(String [] args){
        Employee e1=new Employee("Jack",23000);
        Employee e2=e1;
        System.out.println(e1.getName());
        e2.setName("John");
        System.out.println(e1.getName());
        System.out.println(e2.getName());
    }
}