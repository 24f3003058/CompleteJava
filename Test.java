import java.util.*;
class Employee{
    String eid;
    String ename;
    String eprojects[];
    //parameterized constructor
    public Employee(String eid, String name,String [] projects){
        this.eid=eid;
        this.ename=name;
        this.eprojects=new String[projects.length];
        for(int i=0;i<projects.length;i++){
            this.eprojects[i]=projects[i];
        }
    }
    //copy constructor
    public Employee(Employee e){
        this.eid=e.eid;
        this.ename=e.ename;
        this.eprojects=new String[e.eprojects.length];
        for(int i=0;i<e.eprojects.length;i++){
            this.eprojects[i]=e.eprojects[i];
        }
    }
    public void display(){
        System.out.println("id:"+eid);
        System.out.println("name:"+ename);
        System.out.println("projetcs:");
        for(String i:eprojects){
            System.out.print(i+":");
        }
    }
    public void mutator(){
        this.ename="Mr "+this.ename;
        this.eprojects[0]=null;
    }
}


public class Test {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String project[] = {"P001","P002","P003"};
        String id=s.nextLine();
        String name=s.nextLine();
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1);
        e1.mutator(); 
        e2.display();
    }
    
}
