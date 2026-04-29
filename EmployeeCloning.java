class Date implements Cloneable{
    private int day,month,year;
    public Date(int d,int m,int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }
    public void update(int dd,int mm,int yy){
        this.day=dd;
        this.month=mm;
        this.year=yy;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class EmployeeCloning implements Cloneable {
    private String name;
    private double salary;
    private Date dob;
    EmployeeCloning(String n,double s,Date d){
        this.name=n;
        this.salary=s;
        this.dob=d;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setbday(int dd,int mm,int yy){
        this.dob.update(12,3,2028);
    }
    public String toString(){
        return name+" "+salary+" "+dob;
    }
    public Object clone() throws CloneNotSupportedException{
        EmployeeCloning newemp=(EmployeeCloning)super.clone();
        Date newbday=(Date) dob.clone();
        newemp.dob=newbday;
        return newemp;
    }
    public static void main (String[] args) throws Exception{
        Date d1=new Date(14,11,2023);
        EmployeeCloning e1=new EmployeeCloning("Jack", 21000,d1);
        var e2=(EmployeeCloning)e1.clone();
        e2.setName("John");
        e2.setbday(07,07,2005);
        System.out.println(e1);
        System.out.println(e2);
    }
}
