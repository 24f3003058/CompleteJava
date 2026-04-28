class Date{
    private int date,month,year;
    public Date(int d,int m,int y){
        this.date=d;
        this.month=m;
        this.year=y;
    }
    public String toString(){
        return date+"/"+month+"/"+year;
    }
    public void update(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
}
public class Employee1 implements Cloneable{
    private String name;
    private double salary;
    private Date dob;
    Employee1(String n,double s,Date d){
        this.name=n;
        this.salary=s;
        this.dob=d;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setbday(int dd,int mm,int yy){
        this.dob.update(dd,mm,yy);
    }
    public String toString(){
        return name+" "+salary+" "+dob;
    }
    public static void main(String [] args)  throws Exception{
        Date d1=new Date(14,11,2023);
        Employee1 e1=new Employee1("Jack",21500,d1);
        Employee1 e3=e1;
        Employee1 e2=(Employee1)e1.clone();
        System.out.println(e1);
        System.out.println(e3);
        System.out.println(e2);
        e2.setName("John");
        e2.setbday(07,07,2002);
        System.out.println(e1);
        System.out.println(e3);
        System.out.println(e2);
    }
}


